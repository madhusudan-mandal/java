package com.practice.array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,0,3,1,8,0,0,0,9,0,-1,-6};
		moveZeroToEnd(arr);
		System.out.print("[");
		for(int x : arr)
		{
			System.out.print(x + ", ");
		}
		System.out.print("]");

	}

	private static void moveZeroToEnd(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;	// 
		int temp;
		while(i<arr.length)
		{
			
			// Swap the element arr[i] with arr[j]only when arr[i]==0 and increment i and j both
			if(arr[i]!=0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
//				swap(arr[i], arr[j]);
//				arr[i] = arr[i]+arr[j];
//				arr[j] = arr[i]-arr[j];
//				arr[i] = arr[i]-arr[j];
				i++;
				j++;	
			}
			// if arr[i]==0 increment i only
			else 
				i++;
		}
	}
	static void swap(int a, int b)
	{
		a=a+b;  
		b=a-b;   
		a=a-b;
	}

}
