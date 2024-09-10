package com.practice.array;

import java.util.Scanner;


// Check if given array is sorted or not
public class CheckSortedArray {
	
	static boolean isArraySorted(int[] a) {
		// TODO Auto-generated method stub
		int i,j=1;
		boolean isArraySorted = false;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<=a[j])
			{
				isArraySorted = true;
				if(j<a.length-1)
				{
					j++;
					
				}
			}
			else
			{
				isArraySorted = false;
				break;
			}
		}
		if(isArraySorted == false)
		{		
			j=a.length-2;
			for(i=a.length-1; i>0;i--)
			{
				if(a[i]<=a[j])
				{
					isArraySorted = true;
					if(j>0)
					{
						j--;
					}
				}
				else
				{
					isArraySorted = false;
					break;
				}
			}
		}
		return isArraySorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  new int[7];
		int[] arr1 = {1,2,6,7,9};
		int[] arr2 = {9,7,5,4,2};
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		sc.close();
		System.out.println(isArraySorted(arr));
		System.out.println(isArraySorted(arr1));
		System.out.println(isArraySorted(arr2));
	}

	

}
