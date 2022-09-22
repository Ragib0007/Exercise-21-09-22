package com.exe.dll;

public abstract class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	
	 public HourlyEmployee( String First, String Last, String Job, double hourlyWage, double hoursWorked ) {
		 
		 super( First, Last, Job );
		 setWage( hourlyWage );
		 setHours( hoursWorked );
		
		 }
	 public void setWage( double hourlyWage ) {
		 if ( hourlyWage >= 0.0 )
			 wage = hourlyWage;
		 else
			 throw new IllegalArgumentException("Hourly wage must be >= 0.0" );
			 }
	 public double getWage() {
		 return wage;
	 }
	 public void setHours( double hoursWorked ) {
		 if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
			 hours = hoursWorked;
		 else
			 throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0" );
	 }
	 public double getHours() {
		 return hours;
	 }
	                                                          
	     public double earnings()                                            
	      {                                                                  
	      if ( getHours() <= 40 ) // no overtime
	      return getWage() * getHours();                                
	      else                                                             
	      return 40 * getWage() + ( getHours() -  40 ) * getWage() *  1.5 ;
	     }                                           
	
	                  
	      @Override                                                             
	      public String toString()                                              
	      {                                                                     
	      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
	      super.toString(), "hourly wage" , getWage(),
	        "hours worked", getHours() );
	      } 
	 }
