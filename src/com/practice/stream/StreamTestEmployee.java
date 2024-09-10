package com.practice.stream;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*1. Increase the salary by 20% if salary is less than 500,000 and rating is X
 *2. Increase the salary by 15% if salary is less than 500,000 and rating is C
 *3. Increase the salary by 10% if salary is equal to and greater than 500,000 and rating is X
 *4. Increase the salary by 5% if salary is equal to and greater than 500,000 and rating is C
 *5. Else 0%
 *
 *
 *6. Display all the employee having rating L.
 * 
 * */

import com.practice.lamdaExpression.Employee;

public class StreamTestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new HashSet<>();
		set.add(new Employee("1001", "Madhusudan", "Infra", 380000.0, "X"));
		set.add(new Employee("1002", "Abhishek", "Infra", 340000.0, "X"));
		set.add(new Employee("1003", "Rahul", "Management", 720000.0, "C"));
		set.add(new Employee("1004", "Shudarshan", "Test", 960000.0, "L"));
		set.add(new Employee("1005", "Anil", "Devlopmemnt", 660000.0, "C"));
		set.add(new Employee("1006", "Priyanka", "Devlopement", 1460000.0, "X"));
		set.add(new Employee("1007", "Praful", "Devlopement",840000.0, "L"));
		
		appraisal(set);
		System.out.println();
		printDefaulter(set);
	}

	private static void appraisal(Set<Employee> set) {
		// TODO Auto-generated method stub
		
		List<Employee> list1=set.stream().filter(emp-> emp.getSalary()<500000 && emp.getRating().equals("X")).map(emp-> {
			emp.setSalary(emp.getSalary(), 20);
			return emp;})
			.toList();
		
		List<Employee> list2=set.stream().filter(emp-> emp.getSalary()<500000 && emp.getRating().equals("C")).map(emp-> {
			emp.setSalary(emp.getSalary(), 15);
			return emp;})
			.toList();
		
		List<Employee> list3=set.stream().filter(emp-> emp.getSalary()>=500000 && emp.getRating().equals("X")).map(emp-> {
			emp.setSalary(emp.getSalary(), 10);
			return emp;})
				.toList();
		
		List<Employee> list4=set.stream().filter(emp-> emp.getSalary()>=500000 && emp.getRating().equals("C")).map(emp-> {
			emp.setSalary(emp.getSalary(), 5);
			return emp;})
				.toList();
		List<Employee> list5=set.stream().filter(emp-> emp.getRating().equals("L")).toList();
//		for(Double d : salaryIncrementedByTwentyPerc)
//		{
//			System.out.println(d);
//		}
		set.retainAll(list5);
		set.addAll(list1);
		set.addAll(list2);
		set.addAll(list3);
		set.addAll(list4);
		
		for(Employee e: set)
		{
			System.out.println(e);
		}
		
	}

	private static void printDefaulter(Set<Employee> set) {
		// TODO Auto-generated method stub
		set.stream().filter(emp-> emp.getRating().equals("L")).forEach(System.out::println);
	}

}
