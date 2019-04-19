//Steven Loughran 
//Lab 8
//April 19, 2019

import java.util.*;

	public class Account {
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		Date dateCreated;

		public Account()	{
			this.id = 0;
			this.balance = 0;
			this.annualInterestRate = 0;
			this.dateCreated = new Date();
		}

		public Account(int id, double balance, double annualInterestRate)	{
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			this.dateCreated = new Date();
		}

		public void setID(int id)	{
			this.id = id;
		}
		
		public int getID()	{
			return this.id;
		}

		public void setBalance(double balance)	{
			this.balance = balance;
		}

		public double getbalance()	{
			return this.balance;
		}

		public void setAnnualInterestrate(double annualInterestRate)	{
			this.annualInterestRate = annualInterestRate;
		}

		public double getAnnualInterestrate()	{
			return this.annualInterestRate;
		}
		
		public Date getDateCreated()	{
			return this.dateCreated;
		}

		public double getMonthlyInterestRate()	{
			return (this.annualInterestRate) / 12;
		}
		
		public void withdraw(double amount)	{
			if (this.balance < amount)	{
				System.out.println("Insufficent balance in the account");
			}
			else	{
				this.balance -= amount;
				System.out.println("After withdrawing $" + amount + " balance in account is: $" + this.balance);
			}
		}

		public void deposit(double amount)	{
			this.balance += amount;
			System.out.println(" After depositing $" + amount + " balance inaccount is: $" + this.balance);
		}

		public String toString()	{
			String msg;
			msg = "\nAccount id: " + this.getID() +"\nBalance: " + this.getbalance();
			return msg;
		}
}