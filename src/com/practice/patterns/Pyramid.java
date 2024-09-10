package com.practice.patterns;

public class Pyramid {

	public static void halfPyramid(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void rightPyramid(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void fullPyramid(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void fullPyramid2(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			for(int l=2;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		halfPyramid(row);
		rightPyramid(row);
		fullPyramid2(row);
		fullPyramid(row);
	}

}
