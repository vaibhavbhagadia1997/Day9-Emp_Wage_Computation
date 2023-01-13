package com.bridgelabz.empWageOOPS;

public class MultipleCompany_uc8 {

		public static final int fullTime=1;
		public static final int partTime=2;
		
		public static int ComputeEmpWage(String company, int perHourRate, 
				int numberOfWorkingDays, int maxHourInMonth) { 
		
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
				System.out.println("day: " + totalWorkingDays + "Emp Hour:'" +empHour);
			}
			int totalEmpWage = totalEmpHour + perHourRate;
			System.out.println("Total Employee Wage for company:" +company+" is:" + totalEmpWage);
			return totalEmpWage;
			
		}
		
		     public static void main(String[] args) {
		    	 System.out.println("WELCOME TO EMPLYOEE WAGE COMPUTATION");
		    	 ComputeEmpWage ("Vaibhav plastic pvt. ltd.", 20, 5, 12 );
		    	 ComputeEmpWage ("Indian oil", 10, 5, 20);
		     }
	}

