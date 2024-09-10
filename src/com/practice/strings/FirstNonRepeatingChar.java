package com.practice.strings;


/*Given a string S of lowercase English letters, 
 * the task is to find the index of the first non-repeating character. If there is no such character, return -1.*/
public class FirstNonRepeatingChar {

	static char firstNonRepeatingCharByArray(String s, int length)
	{
		int[] temp = new int[52];
		for(char c : s.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				temp[c-'a']++;
			}
			else if(c>='A' && c<= 'Z')
				temp[c-'A'+26]++;
		}
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==1 && i<26)
				return (char)('a'+i);
			else if(temp[i]==1 && i>=26)
				return (char)('A'+i-26);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="geeksforgeeks";
		String s1 ="geeksororgeeks";
		String s2 = "sssstssss";
		String s3 = "tsssssss";
		String s4 = "ASSaSSIAN";
		
//		System.out.print(firstNonRepeatingChar(s,s.length()) + ", ");
//		System.out.print(firstNonRepeatingChar(s1,s1.length()) + ", ");
//		System.out.print(firstNonRepeatingChar(s2,s2.length()) + ", ");
//		System.out.print(firstNonRepeatingChar(s3,s3.length()) + ", ");
//		System.out.println(firstNonRepeatingChar(s4,s4.length()));

		System.out.print(firstNonRepeatingCharByArray(s,s.length()) + ", ");
		System.out.print(firstNonRepeatingCharByArray(s1,s1.length()) + ", ");
		System.out.print(firstNonRepeatingCharByArray(s2,s2.length()) + ", ");
		System.out.print(firstNonRepeatingCharByArray(s3,s3.length()) + ", ");
		System.out.println(firstNonRepeatingCharByArray(s4,s4.length()));

	}

//	private static char firstNonRepeatingChar(String s, int length) {
//		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		char result ='1';
//		int i=0, j=length-1;
//		while(j>i)
//		{
//			if(sb.charAt(i)==sb.charAt(j))
//			{
//				sb.deleteCharAt(j);
//				sb.deleteCharAt(i);
////				System.out.println(sb);
////				System.out.println(i + " " + j);
////				System.out.println(sb.length());
//				j=sb.length()-1;
////				System.out.println(i + " " + j);
//				result='1';
//			}
//			else
//			{
//				j--;
//				result = sb.charAt(i);
////				System.out.println(sb);
//			}
//		}
//		
//		
//		return result;
//	}

}
