package com.bank.dll;

public class CurrentAccount implements BankAccount {
	private double balance;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public CurrentAccount(double balance) {
		super();
		this.balance = balance;
	}


	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public boolean withdraw(double amount) {
		// 5000 is the minimum balance
		// 25000 is the balance
		// 25000 - 20000 = 5000
		// 25000 - 22000 = 3000 // this should not happen
		
		if((balance - 5000) >= amount) {
			balance -= amount;
			return true;
		}
		
		return false;

	}
}
