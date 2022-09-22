package com.exe.dll;

public  abstract class Employee {
	private String firstName;
	private String LastName;
	private String JobTitle;
	
	public Employee(String First,String Last,String Job){
		firstName=First;
		LastName=Last;
		JobTitle=Job;
		}
	public void setfirstName(String First) {
		firstName=First;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setLastName(String Last) {
		LastName=Last;
	}
	public String getLastName() {
		return LastName;
	}
	public void SetJobTitle(String Job) {
		JobTitle=Job;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	@Override
	public String toString() {
		return String.format(getfirstName(), getLastName(),getJobTitle());
	}
	protected static double getbaseSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
