package com.practice.patterns;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =6;
		halfInvertedPyramid(row);
		fullInvertedPyramid(row);
	}

	private static void fullInvertedPyramid(int row) {
		// TODO Auto-generated method stub
		for(int i=row; i>=1;i--)
		{
			for(int j=1;j<=row-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}

	private static void halfInvertedPyramid(int row) {
		// TODO Auto-generated method stub
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
