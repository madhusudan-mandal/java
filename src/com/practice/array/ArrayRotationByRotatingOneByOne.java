package com.practice.array;


// This approach is not good as time complexity is O(n*length) with space complexity O(n)
// where n is number of rotation and length is length of array
public class ArrayRotationByRotatingOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int numberOfRotation=2;
		leftRotate(arr, numberOfRotation); // O/P: {3,4,5,1,2}
		for(int e: arr)
		{
			System.out.print(e +" " );
		}
		rightRotate(arr, numberOfRotation); // O/P: {4,5,1,2,3};
		for(int e: arr)
			{
				System.out.print(e +" " );
			}
	}

	private static void rightRotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<k;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
			
		}
	}

	private static void leftRotate(int[] arr,int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<k;i++)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1]=temp;
			
		}
	}

}
