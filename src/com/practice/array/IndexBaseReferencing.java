package com.practice.array;

public class IndexBaseReferencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,8,10,1,2,5,4};
		int[] arr1 = {12,3,1,2,6,7,10,20};
		indexBaseReferencing(arr1);
	}

	private static void indexBaseReferencing(int[] arr) {
		// TODO Auto-generated method stub
		int l = arr.length;
		
		for(int i=0; i<l;i++)
		{
			int j=linearSearch1(arr, i+1);
//			System.out.println(j);
			int temp = arr[i];
			if(j>-1)
			{
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
	private static int linearSearch1(int[] arr, int element)
	{
		int i=0;
		int flag =-1;
		while(i<arr.length)
		{
			if(element == arr[i])
			{
				flag=i;
				break;
			}
			else
			{
				flag =-1;
			}
			i++;
		}
		return flag;
	}
		
}
