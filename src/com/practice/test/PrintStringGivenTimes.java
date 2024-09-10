package com.practice.test;


import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;


public class PrintStringGivenTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "s2t1r3i11n6g0";
		printGivenTime(s);
	}

	private static void printGivenTime(String s) {
		// TODO Auto-generated method stub
		int i=0,j=i+1;
		int times=0, counter=0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		while(i<s.length())
		{
			if(j<s.length()&& Character.isDigit(s.charAt(j)))
			{
				times = times*10 + Integer.parseInt(s.valueOf(s.charAt(j++)));
				counter++;
			}
			else
			{
				map.put(s.charAt(i), times);
				times=0;
				i += counter;
				j=i+1;
			}
		}
		Set<Map.Entry<Character, Integer>> setEntry = map.entrySet();
		for(Map.Entry<Character, Integer> entry : setEntry )
		{
			System.out.println(entry.getKey() + ": "+entry.getValue());
		}
	}

}
