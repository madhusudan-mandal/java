package com.practice.strings;

import java.util.ArrayList;

/*
 * Reference : https://www.geeksforgeeks.org/evaluation-of-postfix-expression/
 * 
 * The answer is 879-2*+ = 4.
 * To evaluate a postfix expression, you can use a stack. The steps are as follows:
 * Create an operand stack.
 * If the character is an operand, push it to the operand stack.
 * If the character is an operator, pop two operands from the stack, operate, and push the result back to the stack.
 * After the entire expression has been traversed, pop the final result from the stack.
 * 
 * NOTE : Character to Integer  : Character.getNumericValue(s.charAt(i))
 * 
 */

public class PostFixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "879-2*+";
		int result = postFixString(s);
		System.out.println(result);
		
	}

	private static int postFixString(String s) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al =  new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				al.add(Character.getNumericValue(s.charAt(i)));
			else
			{
				int b=al.remove(al.size()-1);
				int a=al.remove(al.size()-1);
				switch(s.charAt(i))
				{
				case '/':a=a/b;
					break;
				case '*':a=a*b;
					break;
				case '+':a=a+b;
					break;
				case '-':a=a-b;
					break;
				default: break;
				
				}
				al.add(a);
			}
		}
		
		return (int)al.get(0);
	}

}
