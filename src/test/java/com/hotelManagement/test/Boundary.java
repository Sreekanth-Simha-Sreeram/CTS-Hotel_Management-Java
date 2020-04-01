package com.hotelManagement.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


import com.hotelManagement.models.Customer;



public class Boundary {
	
	 @Test
	    public void testpasswordLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(2);
			customer.setCustomerName("john");
			customer.setPassword("john12345678");
			customer.setConfirmPassword("john1234");
			customer.setContactNumber(123456678);
			customer.setEmail("john@gmail.com");
			customer.setCity("bengalore");
			customer.setCountry("India");
			customer.setPincode(234567);
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());


	    }
	 
	 @Test
	    public void testPhoneNumberLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(2);
			customer.setCustomerName("john");
			customer.setPassword("john12345678");
			customer.setConfirmPassword("john1234");
			customer.setContactNumber(1234566783);
			customer.setEmail("john@gmail.com");
			customer.setCity("bengalore");
			customer.setCountry("India");
			customer.setPincode(234567);
	        long contactNumberLength=10;
	        
	    assertEquals( contactNumberLength,customer.getContactNumber());


	    }
	 
	 @Test
	    public void testCustomerNameLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(2);
			customer.setCustomerName("johnsharma");
			customer.setPassword("john12345678");
			customer.setConfirmPassword("john1234");
			customer.setContactNumber(1234566783);
			customer.setEmail("john@gmail.com");
			customer.setCity("bengalore");
			customer.setCountry("India");
			customer.setPincode(234567);
	    int maxChar=5;
	    boolean customerNamelength=((customer.getCustomerName().length())>=maxChar);
	    assertEquals( customerNamelength,customer.getCustomerName().length());
	    }
	 

}
