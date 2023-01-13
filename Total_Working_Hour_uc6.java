package com.bridgelabz.empWageOOPS;
import java.util.Scanner;
public class Total_Working_Hour_uc6 {
	public static final int fullTime=1;
	public static final int partTime=2;
	public static final int perHourRate=20;
	public static final int numberOfWorkingDays=20;
	public static final int maxHourInMonth=100;
	
	void totalWorkingHour()	
	{
		int empHour=0;
		int totalEmpHour=0;
		int totalWorkingDays=0;
		//computation
		while (totalEmpHour < maxHourInMonth && 
				totalWorkingDays < numberOfWorkingDays) {
			totalWorkingDays++;
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
			totalEmpHour+=empHour;
			System.out.println("day#: " + totalWorkingDays + "Emp Hour:'" +empHour);
		}
		int totalEmpWage = totalEmpHour + perHourRate;
		System.out.println("Total Employee Wage:" + totalEmpWage);;
	}
}
	

	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	
	