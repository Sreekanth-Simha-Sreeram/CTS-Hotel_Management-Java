package com.hotelManagement.services;

import com.hotelManagement.models.Availability;
import com.hotelManagement.models.Hotel;

public interface AdminService {
	
	boolean addHotel(Hotel hotel);
	Hotel getHotelById(String hotelId);
	boolean editHotel(Hotel hotel);
	Availability searchHotel(String hotelId);
	boolean deleteHotel(String hotelId);

}
