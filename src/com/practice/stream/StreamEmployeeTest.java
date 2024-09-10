package com.practice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"John", 50000l, "Developer", 30,2018, "Male", "IT"));
		list.add(new Employee(2,"Jasmine", 60000l, "Manager", 35,2015, "Female", "HR"));
		list.add(new Employee(3,"Madhusudan", 75000l, "Senior Developer", 33,2016, "Male", "IT"));
		list.add(new Employee(4,"Soni", 80000l, "Lead Developer", 45,2010, "Female", "IT"));
		list.add(new Employee(5,"Emma", 70000l, "Analyst", 28,2017, "Female", "Finance"));
		list.add(new Employee(6,"Liam", 55000l, "Sales Executive", 29,2019, "Male", "Sales"));
		
		// Calculate the average salary of the employee using Java 8
		System.out.println("Average slary in Rs. "+averageSalary(list));
		System.out.println();
		
		//Average salary of male and female employees
		System.out.println("Avearage salary of male employess in Rs. " + averageSalaryMale(list)+ " "
				+ "and Avearage salary of female employess in Rs. " + averageSalaryFeMale(list));
		System.out.println();
		
		//Find the employees who joined the organization in specific year 
		System.out.println("Employess joined in 2018: " + findEmployeeByJoiningYear(list));
		System.out.println();
		
		//Find the highest salary employee
		System.out.println("Highest Salary employee: " + highestSalaryEmployee(list));
		System.out.println();
		
		//Find the highest salary employee
		System.out.println("Second Highest Salary employee: " + secondHighestSalaryEmployee(list));
		System.out.println();
		
		//Find employee in each department
		employeeInEachDepartment(list);
		System.out.println();
		
		//Find numbers of male and female employees.
		numberOfMaleAndFemaleEmployee(list);
		System.out.println();
		
		//Number of female employees in sales department
		System.out.println(numberOfFemaleInSales(list));
		System.out.println();
		
		//Increment the salary of employee in HR by 10%
		incrementSalaryOfHR(list);
		System.out.println();
		
		//Find the nth Highest Salary employee
		int n=5;
		System.out.println(nthHighestSalary(list,n));
		System.out.println();
	}

	private static List<Employee> nthHighestSalary(List<Employee> list, int n) {
		// TODO Auto-generated method stub
		List<Employee> result = list.stream().sorted((emp1, emp2)-> ((Long)(emp2.getMonthlySalary()-emp1.getMonthlySalary())).intValue()).limit(n).skip(n-1).toList();
		return result;
	}

	private static void incrementSalaryOfHR(List<Employee> list) {
		// TODO Auto-generated method stub
		list.stream().filter(emp->emp.getDepartment().equals("HR")).map(emp-> 
			{emp.setMonthlySalary((emp.getMonthlySalary()*110)/100);
			return emp;
			})
		.forEach(System.out::println);
	}

	private static long numberOfFemaleInSales(List<Employee> list) {
		// TODO Auto-generated method stub
		long number=list.stream().filter(emp-> emp.getDepartment().equalsIgnoreCase("sales")).filter(emp->emp.getGender().equalsIgnoreCase("female")).count();
		return number;
	}

	private static void numberOfMaleAndFemaleEmployee(List<Employee> list) {
		// TODO Auto-generated method stub
		Map<Object, Long> map=list.stream().collect(Collectors.groupingBy(emp-> emp.getGender(), LinkedHashMap::new, Collectors.counting()));
		for(Map.Entry<Object, Long> entries : map.entrySet())
			System.out.println("Number of " + entries.getKey() + " employees are "+entries.getValue());
	}

	private static void employeeInEachDepartment(List<Employee> list) {
		// TODO Auto-generated method stub
		
		Map<Object, Long> map=list.stream().collect(Collectors.groupingBy(emp-> emp.getDepartment(), LinkedHashMap::new, Collectors.counting()));
		for(Map.Entry<Object,Long> entries: map.entrySet())
		{
			System.out.println("Number of employees in "+ entries.getKey() +" department are " + entries.getValue());
		}
	}

	private static List<Employee> secondHighestSalaryEmployee(List<Employee> list) {
		// TODO Auto-generated method stub
		List<Employee> result = list.stream().sorted((emp1,emp2)-> ((Long)(emp2.getMonthlySalary()-emp1.getMonthlySalary())).intValue()).limit(2).skip(1).toList();
		return result;
	}

	private static Employee highestSalaryEmployee(List<Employee> list) {
		// TODO Auto-generated method stub
//		sList<Employee> result=list.stream().sorted((emp1,emp2)-> ((Long)(emp2.getMonthlySalary()-emp1.getMonthlySalary())).intValue()).limit(1).toList();
		// OR
		Employee result = list.stream().max(Comparator.comparing(Employee::getMonthlySalary)).get();
		return result;
	}

	private static List<Employee> findEmployeeByJoiningYear(List<Employee> list) {
		// TODO Auto-generated method stub
		List<Employee> list2=list.stream().filter(emp-> emp.getYearOfjoining()==2018).toList();
		return list2;
	}

	private static long averageSalaryFeMale(List<Employee> list) {
		// TODO Auto-generated method stub
		long result = list.stream().filter(emp-> emp.getGender().equalsIgnoreCase("Female")).collect(Collectors.averagingLong(Employee::getMonthlySalary)).longValue();
		return result;
	}

	private static long averageSalaryMale(List<Employee> list) {
		// TODO Auto-generated method stub
		long result= list.stream().filter(emp->emp.getGender().equalsIgnoreCase("male")).collect(Collectors.averagingLong(Employee::getMonthlySalary)).longValue();
		return result;
	}

	private static long averageSalary(List<Employee> list) {
		// TODO Auto-generated method stub
		long result = list.stream().collect(Collectors.averagingLong(emp-> emp.getMonthlySalary())).longValue();
		return result;
	}

}
