package com.exe.dll;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	private double baseSalary;
	public SalariedEmployee( String First, String Last, String Job,double salary) {
		super( First, Last, Job );
		setWeeklySalary( salary );
	}
	 public void setWeeklySalary( double salary ) {
		 if ( salary >= 0.0 )
			 baseSalary = salary;
		 else {
			 throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		 }}
		 public double getWeeklySalary() {
			 return weeklySalary;
		 }
		 @Override
		 public String toString()  {
			 return String.format( "salaried employee: %s\n%s: $%,.2f",
					 super.toString(), "weekly salary" , getWeeklySalary() );
		 
	 }
		public Object earnings() {
			// TODO Auto-generated method stub
			return null;
		}
	 

}
