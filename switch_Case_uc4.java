package com.bridgelabz.empWageOOPS;

public class switch_Case_uc4 {
	public static final int fullTime=1;
	public static final int partTime=2;

	 void switchCase() 
	{
		int empWage;
		int empHour=0;
		
		//computation
		int empCheck =(int) Math.floor(Math.random() * 10) % 3; 
			switch (empCheck) {
			case  fullTime:
				  empHour=8;
			      break;
			
			case  partTime:
				  empHour=4;
				  break;
				
			default:
				empHour=0;
			}
			empWage = empHour * 20;
			System.out.println("Your Daily Wage is:" + empWage);
		
	}
}
