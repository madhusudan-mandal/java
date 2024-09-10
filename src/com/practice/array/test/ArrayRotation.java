package com.practice.array.test;

public abstract class ArrayRotation {

	 static int[] arr;
	 ArrayRotation(int[] arr){
		 this.arr=arr;
	 }
	
	public abstract void rotateLeft(int[] arr, int rotateBy);
	public abstract void rotateRight(int[] arr, int rotateBy);
	
	public static void printArray() {
		System.out.print("[ ");
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

}
