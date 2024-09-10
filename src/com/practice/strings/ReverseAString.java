package com.practice.strings;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is test string.";
		char[] ch = s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j)
		{
			char c= ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		s=MyArrays.toString(ch);
		System.out.println(s);
	}

}

class MyArrays{
	
	public static String toString(char[] arr)
	{
		String s="";
		for(char c:arr)
		{
			s+= c;
		}
		return s;
	}
}