package com.practice.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Print the word which occurred more than one time in a string
 * 
 * */
public class PrintWordOfMultipleOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a test string and this is to check the string concepts ";
		printMultipleOccurence(s);
	}

	private static void printMultipleOccurence(String s) {
		// TODO Auto-generated method stub
		String[] st = s.toLowerCase().split(" ");
		int i=0;
		Map<String, Integer> map = new LinkedHashMap<>();
		while(i<st.length)
		{
			if(map.containsKey(st[i]))
			{
				map.put(st[i], map.get(st[i])+1);
			}
			else
			{
				map.put(st[i], 1);
			}	
			i++;
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
				System.out.printf(entry.getKey()+" ");
		}
	}

}
