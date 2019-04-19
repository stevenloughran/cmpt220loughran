//Steven Loughran 
//Lab 8
//April 19, 2019

	public class CheckingAccount extends Account{
		public CheckingAccount(int id, double balance, double annualInterestRate)	{
			super(id, balance, annualInterestRate);
		}

		public CheckingAccount()	{
			super();
		}

		public void withdraw(double amount)	{
			if (this.balance < amount) {
				System.out.println("Insufficent balance in the account. You have overdraft limit so your balance is negative now");
				this.balance -= amount;
			} else {
				this.balance -= amount;
				System.out.println("After withdrawing $" + amount + "   balance in account is:   $" + this.balance);
			}
		}

		public String toString()	{
			String msg;
			msg = "\nAccount type: Checking Account" + "\nAccount id: "+this.getID()
					+"\nBalance: "+this.getbalance();
			return msg;
		}
}
