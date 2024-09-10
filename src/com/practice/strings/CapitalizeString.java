package com.practice.strings;

import java.util.ArrayList;
import java.util.List;


public class CapitalizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is for practicing the string questions";
		String s1 = "is for the";
		capitalizeString(s,s1);
//		System.out.println(s2);
	}

	private static void capitalizeString(String s, String s1) {
		// TODO Auto-generated method stub
		String[] s2 = s.split(" ");
//		List<String> l = new ArrayList<>();
//		String[] s3 = s1.split(" ");
//		for(int i=0; i<s2.length; i++)
//		{
//			l.add(s2[i]);
//		}
		for(int i=0;i<s2.length;i++)
		{
			if(s1.indexOf(s2[i])<0)
			{
				s2[i]=s2[i].substring(0, 1).toUpperCase()+s2[i].substring(1);
				// if we do not add s2[i].substring(1), "s2[i].substring(0, 1).toUpperCase()" will print the first element of every string only 
				
			}
//			System.out.println(i + " "+ s2[i]);
			System.out.print(s2[i]);
			if(i!=s2.length-1)
			{
				System.out.print(" ");
			}
		}
//		for(int i=0;i<s2.length;i++)
//		{
//			System.out.print(s2[i]);
//			if(i!=s2.length-1)
//			{
//				System.out.print(" ");
//			}
//		}
		
//		
	}

}
