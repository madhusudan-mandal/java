package com.practice.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,9,2,4,20,16,21};
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
		reverse(arr);
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length;
		int i=0, j=length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
