package com.practice.strings;

import java.util.Arrays;

/*Anagram is a word or phrase which can be made by re-arranging the words or phrase of another string
 * 
 * */
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "anagram";
		String s2 = "namaarg";
		
		if(isAnagram2(s1,s2)==true)
			System.out.println(s1 + " and "+s2 + " are anagram strings");
		else
			System.out.println(s1 + " and " + s2 + " are not anagram");
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(s1.length()!=s2.length())
			flag =false;
		else
		{
			char[] ch1=s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);			// Complexity: O(n)
			Arrays.sort(ch2);
			s1=Arrays.toString(ch1);
			s2=Arrays.toString(ch2);
			if(s1.equals(s2))
				flag=true;
		}
		return flag;
	}
	
	private static boolean isAnagram2(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		char[] ch = new char[26];
		for(int i=0;i<s1.length();i++)
		{
			ch[s1.charAt(i)-'a']++;
			ch[s2.charAt(i)-'a']--;
		}	
			
		for(int i=0;i<26;i++)
		{
			if(ch[i]!=0)
				return false;
		}
		return true;
	}

}
