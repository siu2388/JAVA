package com.test05;

public abstract class Employee {
	String name;
	int number;
	String department;
	int salary;

	Employee() {

	}

	Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	public double tax() {

	}

}
