package com.project.InstaStay.utils;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

import com.project.InstaStay.dto.BookingDTO;
import com.project.InstaStay.dto.RoomDTO;
import com.project.InstaStay.dto.UserDTO;
import com.project.InstaStay.entity.Booking;
import com.project.InstaStay.entity.Room;
import com.project.InstaStay.entity.User;

public class Utils {
	
	private static final String APHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final SecureRandom secureRandom = new SecureRandom();
	
	public static String generateRandomConfirmationCode(int length) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0; i<length; i++) {
			int randomIndex = secureRandom.nextInt(APHANUMERIC_STRING.length());
			char randomChar = APHANUMERIC_STRING.charAt(randomIndex);
			stringBuilder.append(randomChar);
		}
		return stringBuilder.toString();
	}
	
	//User to UserDTO
	public static UserDTO mapUserEntityToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhoneNumber(user.getPhoneNumber());
		userDTO.setRole(user.getRole());
		
		return userDTO;
		
	}
	
	//Room to RoomDTO
	public static RoomDTO mapRoomEntityToRoomDTO(Room room) {
		RoomDTO roomDTO = new RoomDTO();
		
		roomDTO.setId(room.getId());
		roomDTO.setRoomType(room.getRoomType());
		roomDTO.setRoomPrice(room.getRoomPrice());
		roomDTO.setRoomPhotoUrl(room.getRoomPhotoUrl());
		roomDTO.setRoomDescription(room.getRoomDescription());
		
		return roomDTO;
	}
	
	//Booking to BookingDTO
	public static BookingDTO mapBookingEntityToBookingDTO(Booking booking) {
		BookingDTO bookingDTO = new BookingDTO();
		
		bookingDTO.setId(booking.getId());
		bookingDTO.setCheckInDate(booking.getCheckInDate());
		bookingDTO.setCheckOutDate(booking.getCheckOutDate());
		bookingDTO.setNumOfAdults(booking.getNumOfAdults());
		bookingDTO.setNumOfChildren(booking.getNumOfChildren());
		bookingDTO.setTotalNumOfGuest(booking.getTotalNumOfGuest());
		bookingDTO.setBookingConfirmationCode(booking.getBookingConfirmationCode());
		
		
		return bookingDTO;
	}
	
	
	public static RoomDTO mapRoomEntityToRoomDTOPlusBooking(Room room) {
		RoomDTO roomDTO = new RoomDTO();
		
		roomDTO.setId(room.getId());
		roomDTO.setRoomType(room.getRoomType());
		roomDTO.setRoomPrice(room.getRoomPrice());
		roomDTO.setRoomPhotoUrl(room.getRoomPhotoUrl());
		roomDTO.setRoomDescription(room.getRoomDescription());
		
		if(room.getBookings() != null) {
			roomDTO.setBookings(room.getBookings().stream().map(Utils::mapBookingEntityToBookingDTO).collect(Collectors.toList()));
		}
		
		return roomDTO;
	}
	
	
	
	public static UserDTO mapUserEntityToUserDTOPlusUserBookingsAndRoom(User user) {
		UserDTO userDTO = new UserDTO();
		
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhoneNumber(user.getPhoneNumber());
		userDTO.setRole(user.getRole());
		
		if(!user.getBookings().isEmpty()) {
			userDTO.setBookings(user.getBookings().stream().map(booking -> mapBookingEntityToBookingDTOPlusBookingRoom(booking, false)).collect(Collectors.toList()));
		}
		return userDTO;	
	}
	
	public static BookingDTO mapBookingEntityToBookingDTOPlusBookingRoom(Booking booking, boolean mapUser) {
		BookingDTO bookingDTO = new BookingDTO();
		
		bookingDTO.setId(booking.getId());
		bookingDTO.setCheckInDate(booking.getCheckInDate());
		bookingDTO.setCheckOutDate(booking.getCheckOutDate());
		bookingDTO.setNumOfAdults(booking.getNumOfAdults());
		bookingDTO.setNumOfChildren(booking.getNumOfChildren());
		bookingDTO.setTotalNumOfGuest(booking.getTotalNumOfGuest());
		bookingDTO.setBookingConfirmationCode(booking.getBookingConfirmationCode());
		
		if(mapUser) {
			bookingDTO.setUser(Utils.mapUserEntityToUserDTO(booking.getUser()));
		}
		
		if(booking.getRoom() != null) {
			RoomDTO roomDTO = new RoomDTO();
			
			roomDTO.setId(booking.getRoom().getId());
			roomDTO.setRoomType(booking.getRoom().getRoomType());
			roomDTO.setRoomPrice(booking.getRoom().getRoomPrice());
			roomDTO.setRoomPhotoUrl(booking.getRoom().getRoomPhotoUrl());
			roomDTO.setRoomDescription(booking.getRoom().getRoomDescription());
			bookingDTO.setRoom(roomDTO);
		}
		
		return bookingDTO;
	}
	
	public static List<UserDTO> mapUserListEntityToUserListDTO(List<User> userList) {
		return userList.stream().map(Utils::mapUserEntityToUserDTO).collect(Collectors.toList());
	}
 
	public static List<RoomDTO> mapRoomListEntityToRoomListDTO(List<Room> roomList) {
		return roomList.stream().map(Utils::mapRoomEntityToRoomDTO).collect(Collectors.toList());
	}
	
	public static List<BookingDTO> mapBookingListEntityToBookingListDTO(List<Booking> bookingList) {
		return bookingList.stream().map(Utils::mapBookingEntityToBookingDTO).collect(Collectors.toList());
	}
}
