package com.practice.array;

public class MoveZeroToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = { 0, 5, 0, 10, 20, 0, 30 };
	        moveZeroToEnd(arr);
	        //moveZeroWithoutChangingOrder(arr);
	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
	 
	}

	private static void moveZeroToEnd(int[] arr) {
		// TODO Auto-generated method stub
		int j=0;
		while(j<arr.length-1 && arr[j]!=0)
		{
			j++;
		}
		int i=j+1;
		while(i<arr.length-1 && j<arr.length-1)
		{
			if(arr[i]!=0)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static void moveZeroWithoutChangingOrder(int[] arr){
		// TODO Auto-generated method stub
		int i=0; int j=arr.length-1;
		while(i<j)
		{
			if(arr[j]==0)
			{
				j--;
			}
			if(arr[i]==0 && arr[j]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
			
			i++;
		}
	}

}
