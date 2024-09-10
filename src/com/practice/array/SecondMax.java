package com.practice.array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,9,2,4,20,16,22,21};
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
		
		System.out.print("Second Max element: "+ secondMax(arr));
		
	}

	private static int secondMax(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0; i<len; i++)
		{
			if(arr[i]< max && arr[i]>secondMax)
				secondMax=arr[i];
		}
		return secondMax;
	}

}
