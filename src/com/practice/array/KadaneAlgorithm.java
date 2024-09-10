package com.practice.array;

/*
 * Kadane's algorithm is most popular and efficient algorithm to print the maximum sum of sub array of a given array.
 * where element in subarrays should be contiguous
 * 
 * it uses to variable
 * 1. maxEndingHere
 * 		it will check for the subarrays giving max sum
 * 			if current element is greater the sum of elements of subarray till current element
 * 				maxEndingHere will be current element only.
 * 2. maxSoFar
 * 		will keep track of max sum
 * */


public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,4,-5,-7,9,-3,-2,1};
		int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		// TODO Auto-generated method stub
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		for(int i=0;i<arr.length;i++)
		{
			maxEndingHere = Math.max(arr[i],maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}

}
