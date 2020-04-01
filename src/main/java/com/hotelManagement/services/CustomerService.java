package com.hotelManagement.services;

import java.util.List;

import com.hotelManagement.models.Booking;
import com.hotelManagement.models.Customer;
import com.hotelManagement.models.Hotel;

public interface CustomerService {
	
	List<Hotel> searchHotel(String country,String city);
	boolean reserveHotel(Booking booking);
	boolean editReservation(Booking booking);
	Booking getReservationById(String bookingId);
	boolean cancelReservation(String bookingId);
	boolean register(Customer customer);
	boolean login(String customerName,String password);
	

}


