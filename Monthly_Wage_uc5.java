package com.bridgelabz.empWageOOPS;

public class Monthly_Wage_uc5 {
	public static final int fullTime=1;
	public static final int partTime=2;
	public static final int perHourRate=20;
	public static final int totalWorkingDays=20;
	
 void monthlyWage()
 {
	 int empHour=0;
	 int empWage=0;
	 int totalEmpWage=0;
	 
	 //computation
	 int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	 switch (empCheck) {
	 
	 case fullTime:
		 empHour=8;
		 break;
		 
	 case partTime:
		 empHour=4;
		 break;
		 
	default:
		empHour=0;
	 }
	 empWage = empHour * perHourRate;
	 totalEmpWage += empWage; 
	 System.out.println("emplyoee wage" + empWage);
   System.out.println("Total emplyoee wage" + empWage);
 } 
}