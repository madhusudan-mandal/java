package com.practice.lamdaExpression;

public class Employee implements Comparable<Employee>{
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String department, Double salary, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.rating = rating;
	}
	
	private String id;
	private String name;
	private String department;
	private Double salary;
	private String rating;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary, int percentage) {
		this.salary = salary + (salary*percentage)/100;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", rating=" + rating + "]";
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return getName().compareTo(emp.getName());
	}
}
