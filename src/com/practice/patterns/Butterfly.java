package com.practice.patterns;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=10;
		for(int i=1; i<=rows-1;i++)
		{
			for(int j=1; j<=i;j++)
				System.out.print("*");
			for(int k=2*rows-1;k>=2*i+1;k--)
				System.out.print(" ");
			for(int l=1;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<=2*rows-1;i++)
			System.out.print("*");
		System.out.println();
		
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int k=2*rows-1;k>=2*i+1;k--)
				System.out.print(" ");
			for(int l=1;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
	}

}
