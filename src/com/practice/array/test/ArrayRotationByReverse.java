package com.practice.array.test;

public class ArrayRotationByReverse extends ArrayRotation{

	ArrayRotationByReverse(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int k=3;

		ArrayRotationByReverse ar = new ArrayRotationByReverse(arr);
		ar.rotateLeft(arr, k);
		ArrayRotation.printArray();

		ar.rotateLeft(arr, k);
		ArrayRotation.printArray();
		
		ar.rotateRight(arr, k);
		ArrayRotation.printArray();
	}

	public static void reverse(int[] arr,int start, int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start++]=arr[end];
			arr[end--]=temp;
		}
	}
	
	@Override
	public void rotateLeft(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub
		reverse(arr,0, rotateBy-1);
		reverse(arr,rotateBy, arr.length-1);
		reverse(arr,0,arr.length-1);
		
	}

	@Override
	public void rotateRight(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub
		reverse(arr,0,arr.length-1);
		reverse(arr,0,rotateBy-1);
		reverse(arr,rotateBy,arr.length-1);
	}

}
