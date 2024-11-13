package Lab_06;

public class Account {
	private String name;
	private double balance;
	private String AccountNumber;

	public Account(String name , double balance , String AccountNumber){
		this.name = name;
		this.balance = balance ;
		this.AccountNumber = AccountNumber;
	}
	public void depositMoney(double amount){
		if (amount > 0 ){
			balance += amount;
			System.out.println("Amount Deposited: " + amount + "\nNew Balance: " + balance );
		}
		else {
			System.out.println("Your amount must be greater than 0! please try again");
		}
	}
	public void withdrawlMoney(double money){
		if (money > 0 && money <= balance){
			balance -= money;
			System.out.println("Withdrawl Amount: " + money + "\nNew Balanace: " + balance);
		}
		else if (money > balance){
			System.out.println("Insufficient Balance in your account!");
		}
		else {
			System.out.println("Invalid input!");
		}
	}
	public void showBalance(){
		System.out.println("Account Holder Name: " + name);
		System.out.println("Account Balance: " + balance);
		System.out.println("Account Number: " + AccountNumber);
	}
}
