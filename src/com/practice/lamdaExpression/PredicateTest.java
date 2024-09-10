package com.practice.lamdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

// Print the Student with marks greater than 60

public class PredicateTest{
	static ArrayList<Student> addStudent()
	{
		Student s = new Student(101, "Mandal",60);
		Student s1 = new Student(102, "Kanhaiya", 70);
		Student s2 = new Student(103, "Madhusudan", 50);
		ArrayList<Student> al = new ArrayList<>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(new Student(104, "Soni", 90));
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al1 = addStudent();
		Predicate<Student> p = (s3) -> s3.marks>=60;
		for(Student s4:al1)
		{
			if(p.test(s4))
			{
				System.out.print(s4.marks+ " ");
			}
		}
		
	}

}


class Student{
	int id;
	String name;
	int marks;
	Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	Student()
	{
		this.id=0;
		this.name=null;
		this.marks=0;
	}
}

/*
 * Predicate is a boolean function. 
 * 	interface Predicate<T> {
 * 		boolean test(T t);
 * 	}
 * Predicate Interface provides : boolean
 * test(T t) function. predicate also provides chaining function like : and(),
 * or(), negate().
 * Predicate Interface is available in java.util.function package.
 * 
 * Instead of using 'Predicate<Integer> p' we can use 'IntPredicate p'
 * 
 */
