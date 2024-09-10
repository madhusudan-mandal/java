package com.practice.array;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,8,8,9,2,4,20};
		int arr1[] = {4,4,8,8,9,10};
		removeDuplicate(arr, arr.length);
		removeDuplicateFromSorted(arr1, arr1.length);
		System.out.print("[");
		for(int a : arr)
		{
			if(a!=Integer.MIN_VALUE)
			{
				System.out.print(a + ", ");
			}
		}
		System.out.println("]");
		System.out.print("[");
		for(int a : arr1)
		{
			if(a!=Integer.MIN_VALUE)
			{
				System.out.print(a + ", ");
			}
		}
		System.out.print("]");
		
	}

	private static void removeDuplicateFromSorted(int[] arr, int length) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<length-1)
		{
			if(arr[i]==arr[i+1])
			{
				arr[i+1]=Integer.MIN_VALUE;
				
			}
			i++;
		}
	}

	private static void removeDuplicate(int[] arr, int length) {
		// TODO Auto-generated method stub
		int i=0;
		int j=i+1;
		while(i<length && j<length)
		{
			if(arr[j]==arr[i])
			{
				arr[j]=Integer.MIN_VALUE;
				j++;
			}
			else if(j==length-1){
				i++;
				j=i+1;
			}
			else
				j++;
		}
		
	}

}
