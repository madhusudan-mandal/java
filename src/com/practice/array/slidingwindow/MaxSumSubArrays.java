package com.practice.array.slidingwindow;

public class MaxSumSubArrays {

	public static void main(String[] args) {
		 int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
	        int k = 4;
	        int n = arr.length;
	        System.out.println(maxSum(arr, n, k));
	}

	private static int maxSum(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		int i=0;
		int max_sum=0;
		// Find the sum of first window of size k
		while(i<k)
		{
			max_sum +=arr[i];
			i++;
		}
		int current_sum=max_sum;
		while(i<n)
		{
			current_sum += arr[i]-arr[i-k];
			max_sum = Math.max(max_sum, current_sum);
			i++;
		}
		
		return max_sum;
	}
}
