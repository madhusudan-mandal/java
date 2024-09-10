package com.practice.array.test;

public class IndexBaseRefrencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,4,3,1,9};
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
		indexBaseReferencing(arr, arr.length);
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
	}

	private static void indexBaseReferencing(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while(i<length)
		{
			if(arr[i]<=length && arr[i]!=arr[i]+1)
			{
				int temp = arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			i++;
		}
		
	}

}
