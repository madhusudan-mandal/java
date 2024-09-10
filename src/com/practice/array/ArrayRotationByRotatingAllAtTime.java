package com.practice.array;



public class ArrayRotationByRotatingAllAtTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int numberOfRotation=2;
		//leftRotate(arr, numberOfRotation); // O/P: {3,4,5,1,2}
		print(arr);
		rightRotate(arr, numberOfRotation); // O/P: {4,5,1,2,3};
		print(arr);
	}
	
	private static void rightRotate(int[] arr, int numberOfRotation) {
		// TODO Auto-generated method stub
		int[] temp= new int[numberOfRotation];
		int j=0;
		for(int i=arr.length-2;i<arr.length;i++)
		{
			temp[j++]=arr[i];
		}
		for(int i=arr.length-1;i>numberOfRotation-1;i--)
		{
			arr[i]=arr[i-numberOfRotation];
		}
		
		for(int i=0;i<numberOfRotation;i++)
		{
			arr[i]=temp[i];
		}
		
	}

	private static void leftRotate(int[] arr, int numberOfRotation) {
		// TODO Auto-generated method stub
		int[] temp= new int[numberOfRotation];
		for(int i=0;i<numberOfRotation;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=0; i<arr.length-numberOfRotation;i++)
		{
			arr[i]=arr[i+numberOfRotation];
		}
		int j=0;
		for(int i=arr.length-numberOfRotation;i<arr.length;i++)
		{
			arr[i]=temp[j++];
		}
	}

	static void print(int[] arr) {
		for(int e: arr)
		{
			System.out.print(e +" " );
		}
		System.out.println();
	}
}
