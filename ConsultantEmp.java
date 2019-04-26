package EmployeeInheritance;

public class ConsultantEmp extends Employee {

	float noHrs;
	float rateHr;
	
	
	ConsultantEmp() {
		
	}
	
	ConsultantEmp(int id, String name, float noHrs, float rateHr){
		super(id, name);
		this.noHrs = noHrs;
		this.rateHr = rateHr;
		
	}
	
	void calcSalary() {
		
		salary = noHrs * rateHr;
		
	}
	
	void print() {
		
		super.print();
		System.out.println("no. of hrs are : " +noHrs);
		System.out.println("rate per hour : " +rateHr);
		System.out.println("salary is : " +salary);
	}
	
	
	
	
	
	
	
	
	
	
}
