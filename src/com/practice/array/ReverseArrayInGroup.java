package com.practice.array;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,9,2,4,20,16,21};
		int k=arr.length;
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
		reverseInGroup(arr, 4);
		System.out.print("[ ");
		for(int e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println("]");
	}

	private static void reverseInGroup(int[] arr, int k) {
		// TODO Auto-generated method stub
		int len = arr.length;
		if(k>1)
		{
			for(int i=0; i<len; i += k)
			{
				int start =i;
				int end = Math.min(start+k-1, len-1);
				while(start<end)
				{
					int temp=arr[start];
					arr[start] = arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
			}
		}
	}

}
