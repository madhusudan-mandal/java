package com.practice.stream;


public class Employee implements Comparable {
	private int id;
	private String name;
	private long monthlySalary;
	private String designation;
	private int age;
	private int yearOfjoining;
	private String gender;
	private String department;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMonthlySalary(long monthlySalary)
	{
		this.monthlySalary=monthlySalary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public long getMonthlySalary()
	{
		return monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearOfjoining() {
		return yearOfjoining;
	}
	public void setYearOfjoining(int yearOfjoining) {
		this.yearOfjoining = yearOfjoining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return department;
	}
	public void setDesigantion(String designation) {
		this.designation = designation;
	}
	
	public Employee(int id, String name, long monthlySalary, String designation, int age, int yearOfjoining,
			String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.department = department;
		this.age = age;
		this.yearOfjoining = yearOfjoining;
		this.gender = gender;
		this.designation = designation;
	}
	
	Employee()
	{
		super();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this == obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee emp = (Employee)obj;
		return this.getId()==emp.getId() && this.getName()==emp.getName() && this.getMonthlySalary()==emp.getMonthlySalary()
				&& this.getAge()==emp.getAge() && this.getYearOfjoining()==emp.getYearOfjoining() 
				&& this.getGender()==emp.getGender() && this.getDepartment()==emp.getDepartment()
				&& this.getDesignation()==emp.getDesignation();
	}
	
	@Override
	public String toString()
	{
		return "Employee [ id= " + id + ", name= " + name + ", Salary= "+ monthlySalary +  ", Designation= "+ designation +  ", age= "+age + 
				", yearOfJoining= "+ yearOfjoining + ", age= "+ age + ", gender= " + gender +", Departemetn= " + department +" ]";
	}
	
	@Override
	public int compareTo(Object obj)
	{
		Employee emp = (Employee)obj;
		int length1= this.getName().length();
		int length2 = emp.getName().length();
		int min = Math.min(length1,length2);
		char[] c = this.getName().toCharArray();
		char[] c1 = emp.getName().toCharArray();
		if(this.getName().equals(emp.getName()))
			return emp.getId()-this.getId();
		else
		{
			int i=0;
			while(i<min)
			{
				if(c[i]!=c1[i])
					return c1[i]-c[i];
				i++;
				
			}
		}	
		return length2-length1;
	}
}
