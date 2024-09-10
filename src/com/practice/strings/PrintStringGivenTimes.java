package com.practice.strings;

public class PrintStringGivenTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a2b3c10";
		String s1 = "aq2b3c10";
		String s2 = "a2b101c10";
		String s3 = "a2b101c";
		
		printGivenTimes(s);
		System.out.println();
		printGivenTimes(s1);
		System.out.println();
		printGivenTimes(s2);
		System.out.println();
		printGivenTimes(s3);
	}

	private static void printGivenTimes(String s) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder();
		int i=0;
		while(i<s.length())
		{
			int givenTimes=0;
			if(Character.isAlphabetic(s.charAt(i)))
			{
				s1.append(s.charAt(i));
				i++;
			}
			else
			{
				while(i<s.length() && !(Character.isAlphabetic(s.charAt(i))))
				{
					givenTimes = givenTimes*10+ Integer.parseInt(s.valueOf(s.charAt(i)));
//					System.out.println(i + " " + givenTimes + " " + Integer.valueOf(s.charAt(i)));
					i++;
				}
				int j=0;
//				System.out.println(givenTimes);
				while(j<givenTimes)
				{
					System.out.print(s1);
					j++;
				}
//				System.out.println();
				s1.delete(0, s1.length());
			}
		}
	}

}
