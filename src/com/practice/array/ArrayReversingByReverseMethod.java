package com.practice.array;

public class ArrayReversingByReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int numberOfRotation=2;
		leftRotate(arr, numberOfRotation); // O/P: {3,4,5,1,2}
		print(arr);
		rightRotate(arr, numberOfRotation); // O/P: {4,5,1,2,3};
		print(arr);
	}

	private static void rightRotate(int[] arr, int numberOfRotation) {
		// TODO Auto-generated method stub
		reverseArray(arr, 0, arr.length-1);
		reverseArray(arr, 0, numberOfRotation-1);
		reverseArray(arr, numberOfRotation,arr.length-1);
		
	}

	private static void leftRotate(int[] arr, int numberOfRotation) {
		// TODO Auto-generated method stub
		reverseArray(arr, 0, numberOfRotation-1);
		reverseArray(arr, numberOfRotation, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
	}

	private static void reverseArray(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j)
		{
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int e: arr)
			System.out.print(e+" ");
		System.out.println();
	}

}
