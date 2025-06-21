package com.project.InstaStay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.InstaStay.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);
	

}
