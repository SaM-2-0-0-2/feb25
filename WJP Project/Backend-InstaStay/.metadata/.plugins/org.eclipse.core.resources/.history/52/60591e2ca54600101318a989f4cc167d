package com.project.InstaStay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.InstaStay.dto.LoginRequest;
import com.project.InstaStay.dto.Response;
import com.project.InstaStay.dto.UserDTO;
import com.project.InstaStay.entity.User;
import com.project.InstaStay.exception.OurException;
import com.project.InstaStay.repo.UserRepository;
import com.project.InstaStay.service.interfac.UserService;
import com.project.InstaStay.utils.JWTUtils;
import com.project.InstaStay.utils.Utils;

@Service
public class UserServiceImply implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTUtils jwtUtils;

	@Override
	public Response register(User user) {
		Response response = new Response();
				try {
					if(user.getRole() == null || user.getRole().isBlank()) {
						user.setRole("USER");
					}
					
					if(userRepository.existsByEmail(user.getEmail())) {
						throw new OurException(user.getEmail()+" Already Exists");	
					}
					
					user.setPassword(passwordEncoder.encode(user.getPassword()));
					User savedUser = userRepository.save(user);
					
					UserDTO userDTO = Utils.mapUserEntityToUserDTO(savedUser);
					response .setStatusCode(200);
					response.setUser(userDTO);
				} catch (OurException e) {
					response.setStatusCode(400);
					response.setMessage(e.getMessage());
				}catch (Exception e) {
					response.setStatusCode(500);
					response.setMessage("Error occured during user registration"+ e.getMessage());
				}
		return response;
	}

	@Override
	public Response login(LoginRequest loginRequest) {
		Response response =  new Response();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
		var user = userRepository.findByEmail(loginRequest.getEmail()).orElseThrow(()-> new OurException("User not found"));
		
		var token = jwtUtils.generateToken(user);
		response.setStatusCode(200);
		response.setToken(token);
		response.setRole(user.getRole());
		response.setExpirationTime("7 days");
		response.setMessage("Successful");
		
		} catch (OurException e) {
			response.setStatusCode(404);
			response.setMessage(e.getMessage());
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error occured during the user login"+e.getMessage());
		}
		return response;
	}

	@Override
	public Response getAllUsers() {
		Response response = new Response();
		try {
			List<User> userList = userRepository.findAll();
			List<UserDTO> userDTOList  = Utils.mapUserListEntityToUserListDTO(userList);
			response.setStatusCode(200);
			response.setMessage("Successful");
			response.setUserList(userDTOList);
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error getting all Users"+e.getMessage());
		}
		return response;
	}

	@Override
	public Response getUserBookingHistory(String userId) {
		Response response = new Response();

		try {
			User user = userRepository.findById(Long.valueOf(userId)).orElseThrow(()-> new OurException("User Not Found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTOPlusUserBookingsAndRoom(user);
			response.setStatusCode(200);
			response.setMessage("Successful");
			response.setUser(userDTO);
		} catch (OurException e) {
			response.setStatusCode(404);
			response.setMessage(e.getMessage());
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error getting User Booking History"+e.getMessage());
		}
		return response;
	}

	@Override
	public Response deleteUser(String userId) {
		
		Response response = new Response();

		try {
			userRepository.findById(Long.valueOf(userId)).orElseThrow(()-> new OurException("User Not Found"));
			userRepository.deleteById(Long.valueOf(userId));
			response.setStatusCode(200);
			response.setMessage("Successful");
		} catch (OurException e) {
			response.setStatusCode(404);
			response.setMessage(e.getMessage());
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error getting User Booking History"+e.getMessage());
		}
		return response;
	}

	@Override
	public Response getUserById(String userId) {
		Response response = new Response();

		try {
			User user = userRepository.findById(Long.valueOf(userId)).orElseThrow(()-> new OurException("User Not Found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);
			response.setStatusCode(200);
			response.setMessage("Successful");
			response.setUser(userDTO);
		} catch (OurException e) {
			response.setStatusCode(404);
			response.setMessage(e.getMessage());
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error getting User Booking History"+e.getMessage());
		}
		return response;
	}

	@Override
	public Response getMyInfo(String email) {
		Response response = new Response();

		try {
			User user = userRepository.findByEmail(email).orElseThrow(()-> new OurException("User Not Found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);
			response.setStatusCode(200);
			response.setMessage("Successful");
			response.setUser(userDTO);
		} catch (OurException e) {
			response.setStatusCode(404);
			response.setMessage(e.getMessage());
		}catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Error getting User Booking History"+e.getMessage());
		}
		return response;
	}
	
};
