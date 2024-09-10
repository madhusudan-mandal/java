package com.practice.array.test;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9,11,13,15};
		int[] arr1 = {2,4,6,8,10,12,14};
		
		int[] arr2=mergeSortedArray(arr, arr1);
		System.out.print("[ ");
		for(int e: arr2)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
	}

	private static int[] mergeSortedArray(int[] arr, int[] arr1) {
		// TODO Auto-generated method stub
		int l1= arr.length;
		int l2= arr1.length;
		int[] temp = new int[l1+l2];
		int i=0, j=0, k=0;
		while(i<l1 && j<l2 && k<l1+l2)
		{
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr1[j++];
		}
		while(i<l1 && k<l1+l2)
		{
			temp[k++]=arr[i++];
		}
		while(j<l2 && k<l1+l2)
			temp[k++]=arr1[j++];
		
		return temp;
	}

}
