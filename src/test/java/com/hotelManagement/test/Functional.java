package com.hotelManagement.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hotelManagement.models.Availability;
import com.hotelManagement.models.Booking;
import com.hotelManagement.models.Customer;
import com.hotelManagement.models.Hotel;
import com.hotelManagement.services.AdminService;
import com.hotelManagement.services.CustomerService;



public class Functional {
	
	@Test
	public void tesForAddHotel() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	
	Hotel hotel = new Hotel();
	hotel.setHotelId("a2b101");
	hotel.setHotelName("a2b");
	hotel.setCountry("India");
	hotel.setCity("bengalore");
	hotel.setHotelDescription("nice hotel");
	hotel.setNumberOfAcRooms(10);
	hotel.setRatePerNightForAdultInAC(1000);
	hotel.setRatePerNightForChildInAC(800);
	hotel.setRatePerNightForAdultInNonAC(750);
	hotel.setRatePerNightForChildInNonAC(500);
	
    String hotelId=hotel.getHotelId();

	AdminService adminservice=(AdminService) context.getBean("adminService");
	boolean hotelfromdb=adminservice.addHotel(hotel);
	assertSame(hotelId,hotelfromdb);
	
}
	@Test
	public void testGetHotelById() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Hotel hotel = new Hotel();
	hotel.setHotelId("a2b101");
	hotel.setHotelName("a2b");
	hotel.setCountry("India");
	hotel.setCity("bengalore");
	hotel.setHotelDescription("nice hotel");
	hotel.setNumberOfAcRooms(10);
	hotel.setRatePerNightForAdultInAC(1000);
	hotel.setRatePerNightForChildInAC(800);
	hotel.setRatePerNightForAdultInNonAC(750);
	hotel.setRatePerNightForChildInNonAC(500);
	

	AdminService adminservice=(AdminService) context.getBean("adminService");
	Hotel hotelfromdb =adminservice.getHotelById(hotel.getHotelId());
	assertEquals(hotel,hotelfromdb);
}
	
	@Test
	public void testEditHotel()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");		Hotel hotel = new Hotel();
		hotel.setHotelId("a2b101");
		hotel.setHotelName("a2b");
		hotel.setCountry("India");
		hotel.setCity("mysore");
		hotel.setHotelDescription("nice hotel");
		hotel.setNumberOfAcRooms(10);
		hotel.setRatePerNightForAdultInAC(1000);
		hotel.setRatePerNightForChildInAC(800);
		hotel.setRatePerNightForAdultInNonAC(750);
		hotel.setRatePerNightForChildInNonAC(500);
		
		AdminService adminservice=(AdminService) context.getBean("adminService");
		boolean isEdited =adminservice.editHotel(hotel);
		assertEquals(hotel,isEdited);

	
	}
	
@Test
	
	public void testSearchHotelAvailability() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");		
		Availability availability = new Availability();
		Hotel hotel = new Hotel();
		
		availability.setHotelId("a2b101");
		availability.setCountry("India");
		availability.setCity("Bengalore");
		availability.setTotalRooms(2);
		
		AdminService adminservice=(AdminService) context.getBean("adminService");
		Availability hotelfromdb = adminservice.searchHotel(hotel.getHotelId());
		Assert.assertNotNull(hotelfromdb);
	}

@Test
public void testdeleteHotel() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Hotel hotel = new Hotel();
	hotel.setHotelId("a2b101");
	hotel.setHotelName("a2b");
	hotel.setCountry("India");
	hotel.setCity("mysore");
	hotel.setHotelDescription("nice hotel");
	hotel.setNumberOfAcRooms(10);
	hotel.setRatePerNightForAdultInAC(1000);
	hotel.setRatePerNightForChildInAC(800);
	hotel.setRatePerNightForAdultInNonAC(750);
	hotel.setRatePerNightForChildInNonAC(500);
	
	AdminService adminservice=(AdminService) context.getBean("adminService");
	boolean hoteldeleted =adminservice.deleteHotel(hotel.getHotelId());
	assertEquals("a2b101",hoteldeleted,"should delete from db");
}

@Test

public void testSearchHotel() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	
	Hotel hotel = new Hotel();
	hotel.setHotelId("a2b101");
	hotel.setHotelName("a2b");
	hotel.setCountry("India");
	hotel.setCity("mysore");
	hotel.setHotelDescription("nice hotel");
	hotel.setNumberOfAcRooms(10);
	hotel.setRatePerNightForAdultInAC(1000);
	hotel.setRatePerNightForChildInAC(800);
	hotel.setRatePerNightForAdultInNonAC(750);
	hotel.setRatePerNightForChildInNonAC(500);
	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	List<Hotel> hotelfromdb = customerservice.searchHotel(hotel.getCountry(),hotel.getCity());
	Assert.assertNotNull(hotelfromdb);
}


@Test
public void testEditReservation()
{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
	booking.setHotelId("a2b101");
	booking.setNoOfAdults(4);
	booking.setNoOfChildren(2);
	booking.setNoOfNights(2);
	booking.setTotalRooms(2);
	booking.setRoomType("AC");
	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	boolean isEdited = customerservice.editReservation(booking);
	assertEquals(booking,isEdited);


}

@Test
public void testGetReservationById() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");Booking booking = new Booking();
booking.setHotelId("a2b101");
booking.setNoOfAdults(4);
booking.setNoOfChildren(2);
booking.setNoOfNights(2);
booking.setTotalRooms(2);
booking.setRoomType("AC");

CustomerService customerservice=(CustomerService) context.getBean("customerService");
Booking bookingfromdb = customerservice.getReservationById(booking.getBookingId());
assertEquals(booking,bookingfromdb);
}


@Test
public void testCancelReservation() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
	booking.setHotelId("a2b101");
	booking.setNoOfAdults(4);
	booking.setNoOfChildren(2);
	booking.setNoOfNights(2);
	booking.setTotalRooms(2);
	booking.setRoomType("AC");

	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	boolean reservationCancel = customerservice.cancelReservation(booking.getBookingId());
	assertEquals("a2b101",reservationCancel,"should cancelReservation from db");
}

@Test
public void testRegister()
{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	Customer customer = new Customer();
	customer.setCustomerId(2);
	customer.setCustomerName("john");
	customer.setPassword("john1234");
	customer.setConfirmPassword("john1234");
	customer.setContactNumber(123456678);
	customer.setEmail("john@gmail.com");
	customer.setCity("bengalore");
	customer.setCountry("India");
	customer.setPincode(234567);
	
	
			
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	customerservice.register(customer);
	boolean customerfromdb =customerservice.register(customer);
	assertSame(customer,customerfromdb);
}

@Test
public void testLogin()
{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	Customer customer = new Customer();
	
	customer.setCustomerName("john");
	customer.setPassword("john1234");
	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	boolean customerfromdb = customerservice.login(customer.getCustomerName(),customer.getPassword());
	assertSame(true,customerfromdb);
}

@Test
public void testReserveHotel()
{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
	booking.setHotelId("a2b101");
	booking.setNoOfAdults(4);
	booking.setNoOfChildren(2);
	booking.setNoOfNights(2);
	booking.setTotalRooms(2);
	booking.setRoomType("AC");
	
	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	boolean isReserved =customerservice.reserveHotel(booking);
	assertEquals("a2b101",isReserved);

}

}
