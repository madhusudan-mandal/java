package com.practice.test;

import java.util.ArrayList;

// sort the employee by salary and if salary is equals then compare with experience.
// filter stream if experience is greater than 3 years.
class Employee implements Comparable<Employee>{

	private int salary;
	private int experience;
	private String name;
	
	Employee(int salary, int exp, String name)
	{
		this.experience=exp;
		this.salary=salary;
		this.name=name;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	public int getExperience()
	{
		return this.experience;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public int compareTo( Employee e ){
		if(this.getSalary()!=e.getSalary())
			return e.getSalary()-this.getSalary();
		else
			return e.getExperience()-this.getExperience();
//			return this.getName().compareTo(e.getName());
	}
	
	@Override
	public String toString()
	{
		return "Employee [ " + this.getName() + " "+this.getSalary() + " " +this.getExperience() +" ]";
	}
}


public class StreamCheck
{
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(50000,5,"Mandal"));
		al.add(new Employee(60000,3,"Kan"));
		al.add(new Employee(100000, 1, "Avadesh"));
		al.add(new Employee(5000, 15, "Rajesh"));
		al.add(new Employee(16000, 2, "Raj"));
		
		
		al.stream().sorted().filter(e-> e.getExperience()>3).forEach(System.out::println);
	}
}
