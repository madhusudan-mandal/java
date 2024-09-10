package com.practice.strings;


/*
 * String said to be Palindrome if reverse of that string is also same;
 * */
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "thisiht";
		boolean flag=isPalindrome(s);
		boolean flag1=isPalindrome2(s);
		if(flag==false)
			System.out.println("Not a Plaindrome string");
		else
			System.out.println("Palindrome String");
		if(flag1==false)
			System.out.println("Not a Plaindrome string");
		else
			System.out.println("Palindrome String");
	}

	// by reversing the String
	private static boolean isPalindrome2(String s) {
		// TODO Auto-generated method stub
		String s1 = "";
		int j=s.length()-1;
		while(j>=0)
		{
			s1 += s.charAt(j);
			j--;
		}
		if(s.equals(s1))
			return true;
		return false;
	}

	// By comparing each character start to end
	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
