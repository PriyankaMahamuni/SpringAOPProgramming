package org.bridgelabz.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bridgelabz.BusinessCode.Bank;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice{

	public void before(Method m, Object[] args, Object o) throws Throwable {
		// TODO Auto-generated method stub
		Log log=LogFactory.getLog(Bank.class);
		log.info("deposite method.....");
	}

}
