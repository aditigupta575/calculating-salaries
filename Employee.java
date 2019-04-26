package EmployeeInheritance;

public class Employee {
	
	int id;
	String name;
	float salary;
	
	Employee() {
		
	}
	
	Employee(int id, String name) {
		 this.id = id;
		 this.name = name;
				
	}
	
	
	
	void calcSalary() {
		
	}
	
	void print() {
		
		System.out.println("name is :" +name);
		System.out.println("id is : " +id);
		
		
	}
	

}
