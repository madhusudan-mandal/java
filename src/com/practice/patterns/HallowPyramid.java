package com.practice.patterns;

public class HallowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=10;
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int k=2; k<2*i-1;k++)
				System.out.print(" ");
			if(i!=1)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=2*rows-1;i++)
			System.out.print("*");
		
	}

}
