package com.bridgelabz.empWageOOPS;

public class Emp_Attendence_uc1
{
	void empAttendence()
	{
		int fullTime=1;
		double empCheck = (Math.floor(Math.random() * 10) % 2);
		{
		if (empCheck==fullTime)
		
			System.out.println("Emplyoee is Present");
			
		else
			System.out.println("Emplyoee is Absent");
	}
	
  }	
}