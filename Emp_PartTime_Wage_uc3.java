package com.bridgelabz.empWageOOPS;

public class Emp_PartTime_Wage_uc3 {

	void empPartTimeWage()
	{
		int fullTime=1;
		int partTime=2;
		int perHourRate=20;
		int empHour=0;
		int empWage=0;
		
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2; {
			if (empCheck==fullTime)
				empHour=8;
			else if (empCheck==partTime)
				empHour=4;
			else
				empHour=0;
			empWage = empHour * perHourRate;
			System.out.println("Emplyoee Fulltime Wage" + empWage);
			System.out.println("Emplyoee Parttime Wage" + empWage);
		}
	}
}
