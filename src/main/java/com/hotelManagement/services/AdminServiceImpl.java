package com.hotelManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelManagement.dao.AdminServiceDao;
import com.hotelManagement.models.Availability;

import com.hotelManagement.models.Hotel;



@Component
@Service ("adminService")
public class AdminServiceImpl implements AdminService {

	
	@Autowired
	AdminServiceDao adminServiceDao;
	@Transactional
	public boolean addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Hotel getHotelById(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean editHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Availability searchHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		return false;
	}

}
