package com.bank.dll;
import com.bank.dll.BankAccount;
import com.bank.dll.CurrentAccount;
import com.bank.dll.SalaryAccount;
import com.bank.dll.BusinessAccount;
 

public class TestBankAccount {
		public static void main(String[] args) {
			
			
			BankAccount acc1 = null;
			
			System.out.println("****************");
			System.out.println("		Bank Account Detail's			");
			System.out.println("****************");
			
			//Salary Account
			System.out.println("----------------------------------------------");
			System.out.println("1. Salary Account");
			System.out.println("----------------------------------------------");
			
			acc1 = new SalaryAccount(10000);
			
			System.out.println("Balance: " + acc1.getBalance());
			
			acc1.deposit(5000);
			System.out.println("After depositing the balance: " + acc1.getBalance());
			
			if(acc1.withdraw(6000)) {
				System.out.println("Withdrawal happened successfully.");
			}
			else {
				System.out.println("Withdrawal does not happened because insufficient balance.");
			}
			
			System.out.println("After withdrawing the balance: " + acc1.getBalance());
			
			acc1 = new SalaryAccount(35000);
			
			System.out.println("Balance: " + acc1.getBalance());
			
			acc1.deposit(5000);
			
			System.out.println("After depositing the balance: " + acc1.getBalance());
			
			if(acc1.withdraw(30000)) {
				System.out.println("Withdrawal happened successfully.");
			}
			else {
				System.out.println("Withdrawal does not happened because insufficient balance.");
			}
			
			System.out.println("After withdrawing the balance: " + acc1.getBalance());
			System.out.println("----------------------------------------------");
			//Current Account
			System.out.println("-----------------------------------------------");
			System.out.println("2. Current Account");
			System.out.println("----------------------------------------------");
			
			
			acc1 = new CurrentAccount(5000);
			
			System.out.println("Balance: " + acc1.getBalance());
			
			acc1.deposit(5000);
			
			System.out.println("After depositing the balance: " + acc1.getBalance());
			
			if(acc1.withdraw(10000)) {
				System.out.println("Withdrawal happened successfully.");
			}
			else {
				System.out.println("Withdrawal does not happened because insufficient balance.");
			}
			
			System.out.println("After withdrawing the balance: " + acc1.getBalance());
			System.out.println("-----------------------------------------------");
			
			//Business Account
			System.out.println("-----------------------------------------------");
			System.out.println("3. Business Account");
			System.out.println("----------------------------------------------");
	        
			acc1 = new BusinessAccount(100000);
		
			
			System.out.println("Balance: " + acc1.getBalance());
			
			acc1.deposit(5000000);
			
			System.out.println("After depositing the balance: " + acc1.getBalance());
			
			
			if(acc1.withdraw(30000)) {
				System.out.println("Withdrawal happened successfully.");
			}
			else {
				System.out.println("Withdrawal does not happened because insufficient balance.");
			}
			
			System.out.println("After withdrawing the balance: " + acc1.getBalance());
			
			
	 }

}

	
