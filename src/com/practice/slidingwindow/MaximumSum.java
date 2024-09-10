package com.practice.slidingwindow;

/*
 * 1. To find the maximum sum of all subarrays of size K:
 * Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
 * 
 * Input  : arr[] = {100, 200, 300, 400}, k = 2
 * Output : 700
 * 
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
 * Output : 39   We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
 * 
 * Input  : arr[] = {2, 3}, k = 3
 * Output : Invalid   There is no subarray of size 3 as size of whole array is 2.
 * */
public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k=4;
		
		int max_sum=maximumSumBySlidingWindow(arr,k);
		if(max_sum!= Integer.MIN_VALUE)
			System.out.println(max_sum);
		else
			System.out.println("Invalid");
	}

	private static int maximumSumBySlidingWindow(int[] arr, int k) {
		// TODO Auto-generated method stub
		int max_sum = Integer.MIN_VALUE;
		int current_sum=0;
		if(k>arr.length)
		{
			return Integer.MIN_VALUE;
		}
		for(int i=0;i<k;i++)
			current_sum+= arr[i];
		max_sum = Math.max(max_sum, current_sum);
//		System.out.println(max_sum);
		for(int i=k;i<arr.length;i++)
		{
			max_sum = Math.max(max_sum, max_sum-arr[i-k]+arr[i]);
//			System.out.println(max_sum);
		}
		return max_sum;
	}

}
