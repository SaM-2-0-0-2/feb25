
package com.project.InstaStay.service.interfac;

import com.project.InstaStay.dto.Response;
import com.project.InstaStay.entity.Booking;

public interface BookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
