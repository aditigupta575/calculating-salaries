package EmployeeInheritance;

import java.util.Scanner;

public class TestEmployee {

	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter the basic salary of permanent employee ");
		PermanentEmployee perm = new PermanentEmployee(4, "john", s.nextFloat());
		perm.calcSalary();
		perm.print();
		
		System.out.println("\n\n enter no of hours and rate per hour");
		ConsultantEmp cons = new ConsultantEmp(23, "dilip" , s.nextFloat(), s.nextFloat());
		
		cons.calcSalary();
		cons.print();
		
		
		
	}

}
