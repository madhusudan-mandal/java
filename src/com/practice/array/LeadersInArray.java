package com.practice.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program to print all the Leaders in the array. An element is a Leader if it is greater than all the elements to its right side.
 * 
 * Note: The rightmost element is always a leader.
 * 
 * Examples:
 * Input: arr[] = {16, 17, 4, 3, 5, 2}
 * Output: 17 5 2
 * Explanation:
 * 17 is greater than all the elements to its right: 4, 3, 5 and 2, therefore 17 is a leader.
 * 5 is greater than all the elements to its right: 2, therefore 5 is a leader.
 * 2 has no element to its right, therefore 2 is a leader.
 * 
 * source -> geeksforgeeks
 * complexity -> time = O(n)
 *               space = O(n)
 *TOPIC-> Leaders in an Array
 * 
 * An element in array is said to be leader if all elements on its right are smaller than it.
 * There can be any number of Leaders in an array
 * last element will always be leader.
 */


public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {16, 17, 4, 3, 5, 2};
		int arr[] = {1, 2, 3, 4, 5, 0};
		for(int i:leaders(arr, arr.length))
		{
			System.out.println(i);
		}
	}

	private static List<Integer> leaders(int[] arr, int length) {
		// TODO Auto-generated method stub
		int i=0, j=1;
		List<Integer> al = new ArrayList<>();
		
		for(int k:arr)
			al.add(k);
		
		int reduceBy=0;		//When we remove the element from List the index of element will be changed, so reduceBy variable will count the number of time element reduced 
		while(i<length && j<length)
		{
			if(arr[i]<arr[j])
			{
				al.remove(i-reduceBy);  // removing the element at index i - (number of times element was removed)
				reduceBy++;
				i++;
				j=i+1;
			}
			else if(j==length-1)
			{
				i++;
				j=i+1;
			}
			
			else 
				j++;
		}
		return al;
	}

}
