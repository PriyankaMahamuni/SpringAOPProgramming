package org.bridgelabz.BusinessCode;

import org.bridgelabz.Exception.InvalidLoginCredientialsException;

public class LogIn {
		private String username="admin";
		private String password="admin";
		public boolean checking(String username,String password)
		{
			if(username.equals(this.username)&& password.equals(this.password))
			{
				return true;
			}
			else
			{
				throw new InvalidLoginCredientialsException();
			}
		}
}
