package EmployeeInheritance;

public class PermanentEmployee extends Employee {
	
	float basicSal;
	float da;
	float hra;
	
	PermanentEmployee() {
		
	}
	
	PermanentEmployee(int id, String name, float basicSal) {
		super(id, name);
		this.basicSal = basicSal;
		
	}
	
	void calcSalary() {
		da = 0.2f * basicSal;
		hra = 0.15f * basicSal;
		salary = basicSal + da + hra ;
	}
	
	void print() {
		super.print();
		System.out.println("basic Salary is :" +basicSal);
		System.out.println("da is: " +da);
		System.out.println("hra is :" +hra);
		System.out.println("total salary : " +salary);
	}
	
	
	
	

}
