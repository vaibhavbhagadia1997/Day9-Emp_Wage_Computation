package com.bridgelabz.empWageOOPS;

public class  RefactorTheCode_uc7 extends Emp_Attendence_uc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
		
		Emp_Attendence_uc1 A = new Emp_Attendence_uc1();
		A.empAttendence();
		
		Emp_Daily_Wage_uc2 B = new Emp_Daily_Wage_uc2();
				B.empDailyWage();
		
		Emp_PartTime_Wage_uc3 C = new Emp_PartTime_Wage_uc3();
				C.empPartTimeWage();
				
		switch_Case_uc4 D = new switch_Case_uc4();
		D.switchCase();
		
		Monthly_Wage_uc5 E = new Monthly_Wage_uc5();
		E.monthlyWage();
		
		Total_Working_Hour_uc6 F = new Total_Working_Hour_uc6();
		F.totalWorkingHour();
	}

}
