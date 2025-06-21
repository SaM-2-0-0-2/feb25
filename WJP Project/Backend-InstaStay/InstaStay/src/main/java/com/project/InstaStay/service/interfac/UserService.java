package com.project.InstaStay.service.interfac;

import com.project.InstaStay.dto.LoginRequest;
import com.project.InstaStay.dto.Response;
import com.project.InstaStay.entity.User;

public interface UserService{
	Response register(User user);
	
	Response login(LoginRequest loginRequest);
	Response getAllUsers();
	
	Response getUserBookingHistory(String userId);
	
	
	Response deleteUser(String userId);
	Response getUserById(String userId);
	Response getMyInfo(String email);
	
}
