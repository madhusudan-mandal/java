package com.practice.array;

public class FrequencyOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,4,4,4,6,7,7,8,8,8,8,8,9};
		frequency(arr, arr.length);
	}

	private static void frequency(int[] arr, int length) {
		// Time Complexity O(n) with Space Complexity O(1)
		int frequency=1;
		int i=0;
		while(i<length-1)
		{
			if(arr[i]==arr[i+1])
				frequency++;
			else
			{
				System.out.println("Frequency of " + arr[i] + " is : "+ frequency);
				frequency=1;
			}
			i++;
		}
		System.out.println("Frequency of " + arr[i] + " is : "+ frequency);
	}

}
