package com.voter;

public class ValidAgeException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public ValidAgeException(String msg)
	{
		super(msg);
	}
}
