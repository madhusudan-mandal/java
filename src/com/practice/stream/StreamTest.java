package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Ironman", 101, 22, 70));
		al.add(new Student("Ram", 102, 21, 80));
		al.add(new Student("Shayam", 103, 20, 60));
		al.add(new Student("Radhe", 104, 19, 90));
		al.add(new Student("Raman", 105, 23, 50));
		al.add(new Student("Aman", 106, 20, 71));
		al.add(new Student("Krish", 107, 21, 69));
		al.add(new Student("Saktiman", 108, 22, 100));
		al.add(new Student("Saktiman", 109, 21, 50));
		
		int[] numbers= {2800,200,600,1000,1500,2000,};
		
		String s="madhusudan mandal";
		
		String[] array = {"Ironman","Shayam","Ram","Radhe","Saktiman"};
//		getStudentMarksAbove70(al);
//		System.out.println();
//		sortStudentDesc(al);
//		System.out.println();
//		topThreeStudentMarks(al);
//		System.out.println();
//		getStudentMarksLessThan3rdHighest(al);		
//		System.out.println();
//		findSumOfAllMarks(al);	
//		System.out.println();
//		averageStudtentMarksAbove70(al);	
//		System.out.println();
//		countOccurenceOfCharacters(al);	
//		System.out.println();
//		countOccurenceOfCharactersInString(s);	
//		System.out.println();
//		findDuplicates(s);	
		System.out.println();
		getFirstNonReaptingCharacter(s);
		System.out.println();
		findSecondHighest(numbers);
		System.out.println();
		findLongestString(array);
		System.out.println();
		findElementsStartsWith1(numbers);
	}

	private static void getStudentMarksAbove70(ArrayList<Student> al) {
		// TODO Auto-generated method stub
		al.stream().filter(s-> s.getMarks()>70).sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);
	}

	private static void sortStudentDesc(ArrayList<Student> al) {
		// TODO Auto-generated method stub
		al.stream().sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println);
	}
	private static void topThreeStudentMarks(ArrayList<Student> al)
	{
		al.stream().sorted((s1,s2)->((Float)(s2.getMarks()-s1.getMarks())).intValue()).limit(3).forEach(System.out::println);
	}
	private static void getStudentMarksLessThan3rdHighest(ArrayList<Student> al) {
		al.stream().sorted((s1,s2)->((Float)(s2.getMarks()-s1.getMarks())).intValue()).skip(3).forEach(System.out::println);
		
	}

	private static void findSumOfAllMarks(ArrayList<Student> al) {
		// TODO Auto-generated method stub
		float sum = al.stream().map(s-> s.getMarks()).reduce(0f, (x,y)-> x+y);
		System.out.println(sum);
	}
	
	private static void averageStudtentMarksAbove70(ArrayList<Student> al) {
		// TODO Auto-generated method stub
		float sum=al.stream().filter(s -> s.getMarks()>70).map(s->s.getMarks()).reduce(0f, (a,b)-> a+b);
		Long count=al.stream().filter(s->s.getMarks()>70).count();
		
		double average = al.stream().mapToDouble(s->s.getMarks()).filter(marks->marks>70).average().getAsDouble();
		System.out.println(sum/count);
		System.out.println(average);
	}

	private static void countOccurenceOfCharacters(ArrayList<Student> al) {
		Map<String, Long> map= al.stream().flatMap(s-> Stream.of(s.getName())).flatMap(s-> Stream.of(s.split(""))).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
		for(Map.Entry<String, Long> c: map.entrySet())
		{
			System.out.println(c.getKey()+" : " + c.getValue());
		}
	}
	
	private static void countOccurenceOfCharactersInString(String s) {
		Map<String, Long> map= Arrays.stream(s.split("")).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
		for(Map.Entry<String, Long> c: map.entrySet())
			System.out.println(c.getKey() + " : " + c.getValue());
	}
	
	private static void findDuplicates(String s)
	{
		Map<String, Long> map= Arrays.stream(s.split("")).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
		for(Map.Entry<String, Long> ch : map.entrySet())
			if(ch.getValue()>1)
				System.out.println(ch.getKey());
		
		// OR
		System.out.println();
		Arrays.stream(s.split("")).collect(Collectors.groupingBy(ch->ch, Collectors.counting())).entrySet().stream()
		.filter(ch-> ch.getValue()>1).map(ch-> ch.getKey()).forEach(System.out::println);
	}
	
	private static void getFirstNonReaptingCharacter(String s) {
		Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e,LinkedHashMap::new, Collectors.counting())).entrySet()
		.stream()
		.filter(ch-> ch.getValue()==1).limit(1).forEach(System.out::println);
		
//		OR
		
		String s1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(ch-> ch, LinkedHashMap::new, Collectors.counting())).entrySet()
		.stream()
		.filter(ch-> ch.getValue()==1).findFirst().get().getKey();
		System.out.println(s1);
	}
	
	private static void findSecondHighest(int[] number)
	{
		Arrays.stream(number).sorted().skip(number.length-2).limit(1).forEach(System.out::println);
		//for int[] array we can not sort it using Comparable or Comparator as both are applicable for Objects only
		// so we need to convert int[] to it's wrapper class using boxed method of stream.
		
		Arrays.stream(number).boxed().sorted((n,n2)-> n2-n).limit(2).skip(1).forEach(System.out::println);
		
	}
	
	private static void findLongestString(String[] array) {
		String s2=Arrays.stream(array).sorted((s,s1)-> s1.length()-s.length()).findFirst().get();
		
//		or
		
		String s3 = Arrays.stream(array).max((s,s1)->s.length()-s1.length()).get();
		System.out.println(s2 +" "+s3);
	}
	
	private static void findElementsStartsWith1(int[] number) {
		Arrays.stream(number).boxed().filter(n-> n.toString().startsWith("1")).forEach(System.out::println);
		
	}
}


//getStudentMarksAbove70(students);

// sortStudentDesc(students);

// topThreeStudentMarks(students);

// getStudentMarksLessThan3rdHighest(students);

// findSumOfAllMarks(students);

// averageStudtentMarksAbove70(students);

// countOccurenceOfCharacters(s);

// findDuplicates(s);

// getFirstNonReaptingCharacter(s);

// findSecondHighest(numbers);

// findLongestString(sarr);

// findElementsStartsWith1(numbers);
