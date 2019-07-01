package org.bridgelabz.BusinessCode;
import org.bridgelabz.Exception.AcnoNotFoundException;

public class Bank {
		private int amount=5000;
		private String acno="mha909";
		public int deposite(String acno,int amount)
		{
			if(acno.equals("mha909"))
			{
				
				
				this.amount=this.amount-amount;
				return this.amount;
			}
			else
			{
				throw new AcnoNotFoundException();
			}
		}
		public int withdraw(String acno,int amount)
		{
			if(acno.equals(this.acno))
			{
				this.amount=this.amount-amount;
				return this.amount;
			}
			else
			{
				throw new AcnoNotFoundException();
			}
		}
}
