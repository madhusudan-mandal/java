package com.practice.strings;

/**
 * Character class Methods ---------------- isLetter(char ch), isDigit(char ch),
 * isWhitespace(char ch), isUpperCase(char ch), isLowerCase(char ch)
 * toUppercase(char ch), toLowerCase(char ch), toString(char ch)
 */

public class CheckStringIsNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123s4";
		boolean check=checkIfNumeric(s);
		if(check)
			System.out.println("Numeric");
		else
			System.out.println("Not Numeric");
		
	}

	private static boolean checkIfNumeric(String s) {
		// TODO Auto-generated method stub
		int i=0;
		boolean flag = false;
		while(i<s.length())
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				i++;
				flag=true;
			}
				
			else
			{ 
				flag=false;
				break;
			}
		}
		return flag;
	}

}
