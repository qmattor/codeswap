//Quincy Mattor
//java
//3/31/21

package banking_stuff;

import banking_stuff.Checking_Mattor;

public class Teller_Mattor {
	public void generateAccounts()
	{
		BankAccount_Mattor richGuy = new BankAccount_Mattor(new person("Rich Guy", 2, 80), 100000);
		BankAccount_Mattor poorguy = new BankAccount_Mattor();
		poorguy.setOwner(new person("Poor guy", 1.5, 100));
		poorguy.deposit(13.24);
		Savings_Mattor cheapGuy = new Savings_Mattor(new person("Cheap Guy", 1.7, 95), 5000);
		Checking_Mattor bigSpender = new Checking_Mattor(new person("Big spender", 2, 100),
				100000, new Savings_Mattor(new person("Big spender", 2, 100), 100000));

		System.out.println("\n\n***************************TESTING RICH GUY***************************\n");
		richGuy.deposit(10000);
		richGuy.withdraw(5000);
		System.out.println(richGuy.transHistory());
		System.out.println("\n\n***************************TESTING CHEAP GUY***************************\n");
		System.out.println("Interest Rate: " + cheapGuy.getInterestRate());
		System.out.println("Balance : " + cheapGuy.getBalance());
		cheapGuy.deposit(1000);
		cheapGuy.withdraw(500);
		System.out.println(cheapGuy.transHistory());
		System.out.println("\n\n***************************TESTING BIG SPENDER***************************\n");
		System.out.println("Interest Rate: " + bigSpender.getInterestRate());
		System.out.println("Balance : " + bigSpender.getBalance());
		bigSpender.withdraw(150000);
		bigSpender.deposit(100000);
		System.out.println(bigSpender.transHistory());
	}
}
