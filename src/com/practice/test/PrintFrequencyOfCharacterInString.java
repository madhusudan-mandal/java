package com.practice.test;

public class PrintFrequencyOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "thisisteststringletsworkwithstring";
		printFrequency(s);
	}

	private static void printFrequency(String s) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		for(char c: s.toCharArray())
		{
			arr[c-'a']++;
		}
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=0)
				System.out.println((char)(i+'a')+": "+arr[i]);
		}
	}

}
