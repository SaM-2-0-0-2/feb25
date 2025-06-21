package com.project.InstaStay.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.InstaStay.exception.OurException;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;


@Service
public class AwsS3Service {
	private final String bucketName = "instastay-hotel-images";
	
	
	
	@Value("${aws.s3.access.key}")
	private String awsS3AccessKey;
	
	@Value("${aws.s3.secret.key}")
	private String awsS3SecretKey;
	
	public String saveImageToS3(MultipartFile photo) {
		String s3LocationImage = null;
		try {
			
			String s3Filename = photo.getOriginalFilename();
			
			//AWS Credentials for SDK v2
			AwsBasicCredentials awsCreds = AwsBasicCredentials.create(awsS3AccessKey, awsS3SecretKey);		
			
			//S3 client setup for SDK v2
			S3Client s3 = S3Client.builder()
				    .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
				    .region(Region.AP_SOUTHEAST_2) 
				    .build();
					
			//Prepare request
			PutObjectRequest putObjectRequest = PutObjectRequest.builder()
			        .bucket(bucketName)
			        .key(s3Filename)
			        .contentType(photo.getContentType())
			        .build();

			 //Upload
	        s3.putObject(putObjectRequest,RequestBody.fromInputStream(photo.getInputStream(), photo.getSize()));

	        //Construct S3 URL
	        s3LocationImage = "https://" + bucketName + ".s3.amazonaws.com/" + s3Filename;
	        return s3LocationImage;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new OurException("Unable to upload image to S3 bucket" + e.getMessage());
		}
	}
}
