package com.practice.test;

/*Given a string S of lowercase English letters, 
 * the task is to find the index of the first non-repeating character. If there is no such character, return -1.*/
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tssshksbjkk";
		int i=firstNonRepeatingChar(s);
		System.out.println(i);
	}

	private static int firstNonRepeatingChar(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int arr[] =  new int[26];
		while(i<s.length())
		{
			arr[s.charAt(i)-'a']++;
			i++;
		}
		i=0;
		while(i<s.length())
		{
			if(arr[s.charAt(i)-'a']==1)
				return i;
			i++;
		}
		return -1;
		
	}

}
