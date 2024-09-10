package com.practice.lamdaExpression;

/*1. Increase the salary by 20% if salary is less than 50,000 and rating is X
 *2. Increase the salary by 15% if salary is less than 50,000 and rating is C
 *3. Increase the salary by 10% if salary is equal to and greater than 50,000 and rating is X
 *4. Increase the salary by 5% if salary is equal to and greater than 50,000 and rating is C
 *5. Else 0%
 *
 *
 *6. Display all the employee having rating L.
 * 
 * */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesTest {

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
		
		Set<Employee> set1 =  new TreeSet<>();
		set1.addAll(set);
		
		appraisal(set);
		System.out.println();
		appraisal(set1);
		System.out.println();
		printDefaulter(set1);
		
	}

	private static void appraisal(Set<Employee> set) {
		// TODO Auto-generated method stub
		Predicate<Employee> p = emp -> emp.getSalary() < 500000;
		Predicate<Employee> p1 = emp1 -> emp1.getRating().equals("X");
		Predicate<Employee> p2 = emp2 -> emp2.getRating().equals("C");
		
		Consumer<Employee> c = emp -> 
		{
			if(p.and(p1).test(emp))
				emp.setSalary(emp.getSalary(), 20);
			else if(p.and(p2).test(emp))
				emp.setSalary(emp.getSalary(), 15);
			else if(p.test(emp)!=true && p1.test(emp))
				emp.setSalary(emp.getSalary(), 10);
			else if(p.test(emp)!=true && p2.test(emp))
				emp.setSalary(emp.getSalary(), 5);
		};
		
		for(Employee e : set)
			c.accept(e);
		
		for(Employee e:set)
		{
			System.out.println(e+" ");
		}
	}
	private static void printDefaulter(Set<Employee> set)
	{
		Predicate<Employee> p = (emp) -> emp.getRating().equals("L");
		Set<Employee> st = new LinkedHashSet<>();
		Supplier<Set<Employee>> s = () ->
		{ 
			for(Employee e: set)
			{
				if(p.test(e))
					st.add(e);
			}
			return st;
		};
		st.addAll(s.get());
		for(Employee e : st)
		{
			System.out.println(e);
		}
	}
}