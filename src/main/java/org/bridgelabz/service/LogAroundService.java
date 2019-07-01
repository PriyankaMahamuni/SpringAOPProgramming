package org.bridgelabz.service;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bridgelabz.BusinessCode.LogIn;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAroundService implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Log log=LogFactory.getLog(LogIn.class);
		log.info("Loging....");
		System.out.println("before login");
		Object obj=invocation.proceed();
		System.out.println("after login");
		return obj;
	}

	

}
