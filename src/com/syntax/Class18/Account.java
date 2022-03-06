package com.syntax.Class18;

public class Account {
	private String userName = "Teyfur";
	private String password = "Admin";
	public String accountNumber = "123456";
	private double balance = 1500;

	private void printUserName() {
		System.out.println(userName);
	}

	protected void printPassword() {
		System.out.println(password);
	}

	void printBalance() {
		System.out.println(balance);
	}

	public void printAccountNumber() {
		System.out.println(accountNumber);
	}


	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Account account = new Account();
		account.printUserName();
		account.printPassword();
		account.printBalance();
		account.printAccountNumber();
	}

}
