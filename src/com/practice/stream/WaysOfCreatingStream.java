package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysOfCreatingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. From Collection 
		List<Integer> salaryList = Arrays.asList(3000, 4000, 9000, 1000, 3500); 
		Stream<Integer> streamFromIntegerList = salaryList.stream(); 
		
//		2. From Array 
		Integer[] salaryArray = { 3000, 4000, 9000, 1000, 3500 }; 
		Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);
	}

}

/*
Different ways to create a stream : 

1. 

2.  

3. From static method 
	Stream<Integer> streamFromStaticMethod = Stream.of(3000, 4000, 9000, 1000, 3500); 

4. From stream builder 
	Stream.Builder<Integer> streamBuilder = Stream.builder(); 
	streamBuilder.add(300).add(9000).add(4000); 
	Stream<Integer> streamFromBuilder = streamBuilder.build(); 

5. From stream iterate 
	Stream<Integer> streamFromIterate = Stream.iterate(1, e -> e + 2).limit(5); 
*/
 