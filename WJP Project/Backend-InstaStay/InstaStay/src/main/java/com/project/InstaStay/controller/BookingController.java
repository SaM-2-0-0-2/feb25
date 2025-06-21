package com.project.InstaStay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.InstaStay.dto.Response;
import com.project.InstaStay.entity.Booking;
import com.project.InstaStay.service.interfac.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("book-room/{roomId}/{userId}")
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
	public ResponseEntity<Response> saveBookings(@PathVariable Long roomId, @PathVariable long userId, @RequestBody Booking bookingRequest){
		Response response = bookingService.saveBooking(roomId, userId, bookingRequest) ;
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@GetMapping("/all")
	@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Response> getAllbookings(){
		Response response = bookingService.getAllBookings();
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@GetMapping("/get-by-confirmation-code/{confirmationCode}")
	public ResponseEntity<Response> getAllbookingByConfirmationCode(@PathVariable String confirmationCode){
		Response response = bookingService.findBookingByConfirmationCode(confirmationCode);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@DeleteMapping("/cancel/{bookingId}")
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
	public ResponseEntity<Response> cancelbooking(@PathVariable Long bookingId){
		Response response = bookingService.cancelBooking(bookingId);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
}	
