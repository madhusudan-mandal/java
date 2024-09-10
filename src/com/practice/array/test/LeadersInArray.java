package com.practice.array.test;

import java.util.ArrayList;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,4,6,7,5};
		System.out.println(leaders(arr));
	}

	private static ArrayList<Integer> leaders(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		int i=0, j=1;
		while(i<arr.length-1) {
			if(arr[i]<arr[j])
			{
				i++; j=i+1;
			}
			else if(j<arr.length-1 && arr[i]>arr[j])
				j++;
			else
			{
				al.add(arr[i]);
				i++;
				j=i+1;
			}
		}
		al.add(arr.length-1);
		return al;
	}

}
