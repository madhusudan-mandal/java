package com.practice.strings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFrequencyOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is for practicing the string questions";
		printFrequencyOfCharacterInString(s);

	}

	private static void printFrequencyOfCharacterInString(String s) {
		// TODO Auto-generated method stub
		Map<Object,Integer> m = new LinkedHashMap<>();
		char c;
		
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(m.containsKey(c) == false)
			{
				m.put(c, 1);
			}
			else
			{
				int v = m.get(c) +1;
				m.replace(c, v);
			}
		}
		
		Iterator iterator = m.entrySet().iterator();
		System.out.println("Character\tFrequency");
		while(iterator.hasNext())
		{
			Map.Entry<Object, Integer> me = (Map.Entry<Object,Integer>)iterator.next();
			System.out.println(me.getKey() + "\t" + me.getValue());
			
		}
	}
	
/*m.entrySet() is used to retrieve all the key-value pairs called Map.Entries and stores internally into a set.
 *m.entrySet().iterator() returns an iterator that acts as a cursor and points at the first element of the set and moves on till the end.
 *iterator.hasNext() checks for the next element in the set and returns a boolean
 *iterator.next() returns the next element(Map.Entry) from the set.
 *me.getKey() returns the key of the associated Map.Entry
 *me.getValue() return the value of the associated Map.Entry
 * */
	
	

}
