package com.practice.lamdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
// Change the Students Marks to grade, based on grade system using Function Interface
public class FunctionTest {

	String applyGrade(Student s1)
	{
		Predicate<Student> p = s-> s.marks>90;
		Predicate<Student> p1 = s-> s.marks>80;
		Predicate<Student> p2 = s-> s.marks>70;
		Predicate<Student> p3 = s-> s.marks>60;
		Predicate<Student> p4 = s-> s.marks>50;
		Predicate<Student> p5 = s-> s.marks>40;
		
		Function<Student, String> f = s -> {
			if(p.test(s))
				return "A";
			else if(p1.test(s))
				return "B";
			else if(p2.test(s))
				return "C";
			else if(p3.test(s))
				return "D";
			else if(p4.test(s))
				return "E";
			else if(p5.test(s))
				return "F";
			else
				return "G";
		};
		return f.apply(s1);     
		// apply(T t) is an abstract method of Functional interface Function<T, O>, which return O and take T as an argument
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionTest ft = new FunctionTest();
		ArrayList<Student> al = new ArrayList<>();
		al.addAll(PredicateTest.addStudent());
		al.add(new Student(105, "Avadesh", 80));
		for(Student s:al)
		{
			System.out.println(s.marks + " " + ft.applyGrade(s));
		}
	}
	
}

/*
 * Function is a Interface contains only one abstract method : apply()
 * 1.To perform certain operation and to return some result we should go for function.
 * 2.interface Function<T,R> {
 * 		R apply(T t);
 * }
 * Function can take 2 type parameters. First one represent input argument type and
 * second one represent return type.
 * Function can return any type of value.
 * Instead of Function<T,R> we can use IntFunction<R>
 * 
 * 
 * It’s possible to join function into a single function by using the following methods. 
 * compose() 
 * andThen() 
 * identity() 
 * 
 */