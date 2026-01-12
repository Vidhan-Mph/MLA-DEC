package com.test.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeAroundAspect {
public Object employeeAroundAdvice(ProceedingJoinPoint proccedingJoinPoint)
{
	System.out.println("Before executing getName() method");
	
	Object value=null;
	try
	{
		
		value=proccedingJoinPoint.proceed();
			
	}
	catch(Throwable e)
	{
		e.printStackTrace();
	}
	System.out.println("After executing getName() method ");
	return value;
}
}
