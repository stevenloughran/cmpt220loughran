
public class AccountTest {
//Steven Loughran 
//Lab 8
//April 19, 2019
	
	  public static void main(String args[])	{
		  Account ac = new Account(1122, 20000, 4.5);
		  	System.out.println("Account id: " + ac.getID());
		  	System.out.println("Initial account balance: $"+ac.getbalance());
	        System.out.println("Withdrawing $2500: ");
	        ac.withdraw(2500);
	        System.out.println("balance after withdrawl: $"+ac.getbalance());
	        System.out.println("Depositing $3000");
	        ac.deposit(3000);
	        System.out.println("Balance in account is: $" + ac.getbalance());
	        System.out.println("Monthly Interest is: $" + (ac.getMonthlyInterestRate() * ac.getbalance()) / 100);
	        System.out.println("Account was created on: " + ac.getDateCreated());
	        System.out.println(ac);

	        
	        SavingsAccount sac = new SavingsAccount(1132, 20000, 4.5);
	        System.out.println("Account id for Savings: "+sac.getID());
	        System.out.println("Initial account balance: $"+sac.getbalance());
	        System.out.println("Withdrawing $2500: ");
	        sac.withdraw(2500);
	        System.out.println("Balance after withdrawl: $"+sac.getbalance());
	        System.out.println("Depositing $3000");
	        ac.deposit(3000);
	        System.out.println("Balance in account is: $" + sac.getbalance());
	        System.out.println("Monthly Interest is: $" + (sac.getMonthlyInterestRate() * sac.getbalance()) / 100);
	        System.out.println("Account was created on: " + sac.getDateCreated());
	        System.out.println(sac);


	        CheckingAccount cac = new CheckingAccount(1142, 20000, 4.5);
	        System.out.println("Account id for Checking: "+cac.getID());
	        System.out.println("Initial account balance: $"+cac.getbalance());
	        System.out.println("Withdrawing $25000: ");
	        cac.withdraw(25000);
	        System.out.println("Balance after withdrawl: $"+cac.getbalance());
	        System.out.println("Depositing $3000");
	        cac.deposit(3000);
	        System.out.println("Balance in account is: $" + cac.getbalance());
	        System.out.println("Monthly Interest is: $" + (cac.getMonthlyInterestRate() * cac.getbalance()) / 100);
	        System.out.println("Account was created on: " + cac.getDateCreated());
	        System.out.println(cac);

	      }

	}