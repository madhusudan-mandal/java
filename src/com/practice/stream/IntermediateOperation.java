package com.practice.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
public class IntermediateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("apple");
		l.add("banana");
		l.add("cherry");
		l.add("coconut");
		l.add("apple");
		l.add("banana");
		l.add("watermelon");
		
		Stream<String> streamList = l.stream();
//		streamList.map((s)-> s.toUpperCase()).forEach(System.out::println);
//		streamList.filter(s-> s.length()>6).forEach(System.out::println);
		// Line 21 will not work and will throw a runtime exception as terminator operation of Stream is already appiled
		// Error: stream has already been operated upon or closed
		
		// streamList.map(Fubction<String, R>).filter(Perdicate<String>).distinct()
		l=streamList.map(String::toUpperCase).filter(s-> s.length()>5).distinct().sorted((s,s1)->s1.compareTo(s))
			.limit(3).skip(1).flatMap(s-> Stream.of(s.split(""))
			.peek(System.out::println)).collect(Collectors.toList());
		System.out.println(l.size());
	}

}

/*
 *filter: filters the elements
 *Stream<String> mystream = Stream.of("Hello", "World", "Hi", "Bye", "See You"); 
 *mystream.filter(e -> e.length() > 5).collect(Collectors.toList());
 *
 *map: used to transform each element 
 *mystream.map(e -> e.toLowerCase()).collect(Collectors.toList()); 
 *
 *flatMap(flatmap convert a 2D list into a 1D list):used to iterate over each element of the complex collection and helps to flatten it.
 *Fattens a Stream of Streams into a single Stream
 *
 *distinct: remove duplicates from stream
 *
 *sorted : sort the elements 
 *
 *peek : helps you to see the intermediate results of the stream which is getting processed 
 *	This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline: 
 *
 *limit: Truncate the stream, to have no longer than given maximum size
 *
 *skip: skip the first n elements of the stream 
 *
 *mapToInt: helps to work with primitive "int" data type
 *
 *
 **/