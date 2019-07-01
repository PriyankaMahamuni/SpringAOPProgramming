package org.bridgelabz.SpringAOPApplication;

import org.bridgelabz.BusinessCode.Bank;
import org.bridgelabz.BusinessCode.LogIn;
import org.bridgelabz.service.LogAfterService;
import org.bridgelabz.service.LogAroundService;
import org.bridgelabz.service.LogBeforeService;
import org.bridgelabz.service.LogInExceptionService;
import org.springframework.aop.framework.ProxyFactoryBean;

public class MainApplication {
	public static void main( String[] args )
    {
		/*
		 * purpose :  for using MethodBeforeAdvice
		 */
        //creating target
    	Bank bankObject=new Bank();
    	//creating advice
    	LogBeforeService lbs=new LogBeforeService();
    	//add target+advice
    	
    	ProxyFactoryBean pfb=new ProxyFactoryBean();
    	pfb.setTarget(bankObject);
    	//int xml file we have to use
    	//pfb.setInterceptorNames(new String[] {"lbs"});
    	 pfb.addAdvice(lbs);
    	
    	
    	//get generated proxy object
    	Bank bproxy=(Bank)pfb.getObject();
    	int amount=bproxy.deposite("mha909", 500);
    	System.out.println(amount);
    	
    	/**
    	 *  purpose : for using afterReturningAdvice method
    	 */
    	
    	//creating service
    	LogAfterService las=new LogAfterService();
    	
    	//adding business and service
    	ProxyFactoryBean beanProxy=new ProxyFactoryBean();
    	beanProxy.setTarget(bankObject);
    	beanProxy.addAdvice(las);
    	
    	Bank bankProxy=(Bank)beanProxy.getObject();
    	int amt =bankProxy.withdraw("mha909", 500);
    	System.out.println(amt);
    	
    	/**
    	 *  purpose : for using MethodIntersepter
    	 */
    	LogIn login=new LogIn();
    	LogAroundService logService=new LogAroundService();
    	
    	ProxyFactoryBean logProxy=new ProxyFactoryBean();
    	logProxy.setTarget(login);
    	logProxy.addAdvice(logService);
    	
    	LogIn loginObject=(LogIn)logProxy.getObject();
    	boolean status=loginObject.checking("admin", "admin");
    	if(status)
    	{
    		System.out.println("Login success....");
    	}
    	else
    	{
    		System.out.println("Login failed");
    	}
    	/**
    	 *  purpose : for using  throwAdvice
    	 */
    	LogInExceptionService loginService=new LogInExceptionService();
    	
    	ProxyFactoryBean loginProxy=new ProxyFactoryBean();
    	loginProxy.setTarget(login);
    	loginProxy.addAdvice(loginService);
    	
    	LogIn logObject=(LogIn)logProxy.getObject();
    	boolean flag=loginObject.checking("adm", "admin");
    	if(flag)
    	{
    		System.out.println("Login success....");
    	}
    	else
    	{
    		System.out.println("Login failed");
    	}

    }
}
