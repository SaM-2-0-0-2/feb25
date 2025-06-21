package com.project.InstaStay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.InstaStay.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}