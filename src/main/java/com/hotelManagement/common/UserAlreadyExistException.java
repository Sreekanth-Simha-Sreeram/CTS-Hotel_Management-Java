package com.hotelManagement.common;

public class UserAlreadyExistException extends Exception {
	
	public static  String message="user already exists !..please login";


	public UserAlreadyExistException()
	{
		
	}
	public UserAlreadyExistException(String message)
	{
		this.message=message;
	}

}
