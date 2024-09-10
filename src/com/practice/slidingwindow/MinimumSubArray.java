package com.practice.slidingwindow;

/*Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum greater than the given value. 
	
	Examples:
	
	arr[] = {1, 4, 45, 6, 0, 19}
	   x  =  51
	Output: 3
	Minimum length subarray is {4, 45, 6}
	arr[] = {1, 10, 5, 2, 7}
	   x  = 9
	Output: 1
	Minimum length subarray is {10}
	arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
	    x = 280
	Output: 4
	Minimum length subarray is {100, 1, 0, 200}
	
	*/
public class MinimumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 45, 6, 7, 49};
		int x  =  51;
		
		int minlength = minimumSumSubArray(arr,x);
		System.out.println(minlength);
		
	}

	private static int minimumSumSubArray(int[] arr, int x) {
		// TODO Auto-generated method stub
		int window_sum = 0;
		int start =0, end=0;			// starting and end of window
		int min_length = arr.length;
		while(end<arr.length)
		{
			while(end<arr.length && window_sum<=x)
			{
				window_sum +=arr[end++];
			}
			while(start<arr.length && window_sum>x)
			{

				if(end-start<min_length)
					min_length = end-start;
				window_sum -= arr[start++];
			}
		}
		return min_length;
	}

}


/*
 * Approach:

We can solve this problem using Sliding Window Technique and maintaining two pointers: start and end to mark the starting and ending 
of the window. We can keep incrementing the end pointer till the sum of the window is less than or equal to X. 
When, the sum of window becomes greater than X, we record the length of the window and start moving the start pointer till the sum of
 window becomes smaller than or equal to X. Now, when the sum becomes smaller than or equal to X, again start incrementing the end 
 pointer. Keep on moving the start and end pointer till we have reached the end of the array.


 * 
 * 
 * */
