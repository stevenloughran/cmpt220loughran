//Steven Loughran 
//Lab 8
//April 19, 2019

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance, double annualInterestRate)	{
		super(id, balance, annualInterestRate);	}

	public SavingsAccount()	{
		super();	}

	public String toString()	{
		String msg;
		msg = "\nAccount type: Savings Account" + "\nAccount id: "+this.getID()
				+"\nBalance: "+this.getbalance();
		return msg;
		}
	}