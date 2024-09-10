package com.practice.array.test;

public class ArrayRotationOneByOne extends ArrayRotation {

	ArrayRotationOneByOne(int[] arr) {
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

	@Override
	public void rotateLeft(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub

		int n = arr.length;
		int[] temp = new int[n];
		for(int i=rotateBy-1; i<n;i++)
		{
			temp[i]=arr[i-n-rotateBy];
		}
		for(int i=0;i<n-rotateBy-1;i++)
		{
			temp[i]=arr[i+n-rotateBy-1];
		}
	}

	@Override
	public void rotateRight(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub
		
	}

}
