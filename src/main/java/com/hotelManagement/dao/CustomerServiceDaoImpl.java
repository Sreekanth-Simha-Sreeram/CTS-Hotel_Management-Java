package com.hotelManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hotelManagement.models.Booking;
import com.hotelManagement.models.Customer;
import com.hotelManagement.models.Hotel;
@Component
public class CustomerServiceDaoImpl implements CustomerServiceDao {
	@Autowired
	@Transactional
	public List<Hotel> searchHotel(String country, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean reserveHotel(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean editReservation(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Booking getReservationById(String bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean cancelReservation(String bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean register(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(String customerName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
