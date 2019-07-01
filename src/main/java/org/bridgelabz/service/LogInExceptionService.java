package org.bridgelabz.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bridgelabz.BusinessCode.LogIn;
import org.springframework.aop.ThrowsAdvice;

public class LogInExceptionService implements ThrowsAdvice{
	public void afterThrowing(Exception e)
	{
		Log log=LogFactory.getLog(LogIn.class);
		log.info("Exception : ");
	}
}
