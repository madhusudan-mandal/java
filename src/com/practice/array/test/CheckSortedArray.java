package com.practice.array.test;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,8};
		int[] arr1 = {1,2,5,4,3};
		int[] arr2 = {6,5,4,3,1};
		System.out.println(CheckSortedArray.isArraySorted(arr));
		System.out.println(CheckSortedArray.isArraySorted(arr1));
		System.out.println(CheckSortedArray.isArraySorted(arr2));
	}
	
	static boolean isArraySorted(int[] arr)
	{
		boolean isSorted =false;
		int i=0, j=0;
		
		while(i<arr.length-2)
		{
			if(arr[i]<=arr[i+1])
			{
				isSorted =true;
				i++;
			}
			else
			{
				isSorted=false;
				break;
			}
		}
		if(isSorted==false)
		{
			while(j<arr.length-2)
			{
				if(arr[j]>= arr[j+1])
				{
					isSorted = true;
					j++;
				}
				else
				{
					isSorted = false;
					break;
				}
			}
		}
		return isSorted;
	}

}
