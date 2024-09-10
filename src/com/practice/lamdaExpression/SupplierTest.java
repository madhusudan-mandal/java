package com.practice.lamdaExpression;

import java.util.Random;
import java.util.function.Supplier;
// Generate an OTP using supplier
public class SupplierTest {

	public static String otpGenarator(String s, Integer l) {
		Supplier<String> sp = () ->{
			String s1 = "";
			for(int i=0; i<l;i++)
			{
				s1 = s1 + s.charAt( new Random().nextInt(s.length()));
			}
			return s1;
		};
		return sp.get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0123456789";
		Integer lengthOfOtp = 6;
		System.out.println(otpGenarator(s,lengthOfOtp));
	}
	
	

}

/*
 * Supplier is an Interface contains single abstract method : get()
 * 
 * interface Supplier<R> { R get(); }
 * 
 * Supplier will not take any input but will always return something.
 * 
 */