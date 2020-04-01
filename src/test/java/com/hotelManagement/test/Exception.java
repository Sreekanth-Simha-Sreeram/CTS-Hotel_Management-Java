package com.hotelManagement.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.hotelManagement.common.UserAlreadyExistException;
import com.hotelManagement.common.UserDoesNotExistException;
import com.hotelManagement.models.Customer;
import com.hotelManagement.services.CustomerService;

import junit.framework.Assert;

public class Exception {
	
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
		customerservice.login(customer.getCustomerName(),customer.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user already exists !..please login");
    
	
	 }


}
