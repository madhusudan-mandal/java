package com.practice.strings;

public class EvenNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "14";
		System.out.println(countEvenNumbers(s));
	}

	private static int countEvenNumbers(String s) {
		// TODO Auto-generated method stub
		int j=0, i=0;
		StringBuffer s1 = new StringBuffer();
		int count =0;
		while(i<s.length())
		{
			if(j<s.length())
			{
				s1 = s1.append(s.charAt(j));
//				System.out.println(s1);
				j++;
			}
			else
			{
				s1=new StringBuffer();
				j=++i;
			}
			if(s1.length()>0 && Integer.parseInt(s1.toString())%2 ==0)
			{
				count += 1;
			}
		}
		return count;
	}

}
