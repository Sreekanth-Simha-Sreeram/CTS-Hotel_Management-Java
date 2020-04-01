package com.hotelManagement.dao;

import com.hotelManagement.models.Availability;
import com.hotelManagement.models.Hotel;

public interface AdminServiceDao {
	
	boolean addHotel(Hotel hotel);
	Hotel getHotelById(String hotelId);
	boolean editHotel(Hotel hotel);
	Availability searchHotel(String hotelId);
	boolean deleteHotel(String hotelId);

}
