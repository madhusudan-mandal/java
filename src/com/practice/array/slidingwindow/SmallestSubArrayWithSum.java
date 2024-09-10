package com.practice.array.slidingwindow;

/* Given an array arr[] of integers and a number X, the task is to find the smallest subarray with a sum greater than the given value.
 *	
 * Approach:
 * We can solve this problem using Sliding Window Technique and maintaining two pointers: start and end to mark the starting and ending of the window.
 * We can keep incrementing the end pointer till the sum of the window is less than or equal to X.
 * When, the sum of window becomes greater than X, we record the length of the window and start moving the start 
 * pointer till the sum of window becomes smaller than or equal to X. Now, when the sum becomes smaller than or equal 
 * to X, again start incrementing the end pointer. Keep on moving the start and end pointer till we have reached the 
 * end of the array.
 */

public class SmallestSubArrayWithSum{
	
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 45, 6, 10, 19}; 
	    int x = 51; 
	    int n = arr.length;
	    int smallestSubArrayLength= smallestSubArrayWithSum(arr, n, x);
	    if(smallestSubArrayLength==n+1)
	    {
	    	System.out.println("No SubArray availble");
	    }
	    else
	    	System.out.println(smallestSubArrayLength);
	}
	
	public static int smallestSubArrayWithSum(int[] arr, int n, int x) {
		int start =0;
		int end=0;
		int smallestSubArrayLength=0;
		int sum=0;
		if(arr[start]>=x) {
			return 1;
		}
		while(end < n)
		{
			while(sum<=x && end <n)
			{
				sum += arr[end];
				end++;
				smallestSubArrayLength++;
			}
			while(sum>=x && start<n)
			{
				sum -= arr[start++];
				smallestSubArrayLength--;
			}
		}
		return smallestSubArrayLength;
	}
}
