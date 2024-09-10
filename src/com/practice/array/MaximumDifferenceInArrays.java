package com.practice.array;

public class MaximumDifferenceInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,9,2,20,16,21};
		int maxDiffer = maximumDifference(arr, arr.length);
		System.out.println(maxDiffer);
	}
	
	public static int maximumDifference(int[] arr, int l)
	{
		int i=0;
		int j=i+1;
		int max=-1;
		int differ = -1;
		while(i<l-1)
		{
			differ= arr[j]-arr[i];
			if(max<differ)
				max=differ;
			if(j<l-1)
				j++;
			else
			{
				i++;
				j=i+1;
			}
		}
		return max;
	}
}
