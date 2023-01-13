package com.bridgelabz.empWageOOPS;

public class Emp_Daily_Wage_uc2 {

	void empDailyWage()
	{
		int fullTime=1;
		int perHourRate=20;
		int empHour=0;
		int empWage=0;
		
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2; {
			if (empCheck==fullTime)
				empHour=8;
			else
				empWage=0;
			empWage = empHour * perHourRate;
			System.out.println("Dail Emplyoee Wage" + empWage);
		}
		
	}
}
