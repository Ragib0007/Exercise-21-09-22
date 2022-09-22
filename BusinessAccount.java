package com.bank.dll;

public class BusinessAccount implements BankAccount {

		
		private double balance;
		
		public BusinessAccount() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public BusinessAccount(double balance) {
			super();
			this.balance = balance;
		}


		@Override
		public double getBalance() {
			return balance;
		}

		@Override
		public void deposit(double amount) {
			if(amount > 2500000) {
				// balance += amount + amount * (0.001);
				balance += amount * (1.001);
			}
			else
				balance += amount;
			
			
		}

		@Override
		public boolean withdraw(double amount) {
			if((balance + 25000) >= amount) {
				balance -= amount;
				return true;
			}
			
			return false;
		}


}
