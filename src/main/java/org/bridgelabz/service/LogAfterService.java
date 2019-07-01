package org.bridgelabz.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bridgelabz.BusinessCode.Bank;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfterService implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Log log=LogFactory.getLog(Bank.class);
		log.info("Amount Withdraw Sucessfully....");
	}
	

}
