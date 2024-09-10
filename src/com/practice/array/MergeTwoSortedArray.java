package com.practice.array;

import com.practice.array.CheckSortedArray;
public class MergeTwoSortedArray {

	int[] mergeTwoSortedArray(int a[], int b[])
	{
		int l1 = a.length, l2 = b.length;
		int[] mergedArray = new int[l1 + l2];
		int i=0, j=0, k=0;
		while(i<l1 && j<l2)
		{
			if(a[i]<=b[j])
			{
				mergedArray[k] = a[i];
				i++;
			}
			else
			{
				mergedArray[k] = b[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			mergedArray[k]=a[i];
			i++;k++;
		}
		while(j<l2)
		{
			mergedArray[k]=b[j];
			j++;k++;
		}
		return mergedArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[0]=2;
		arr[1]=9;
		arr[2]=9;
		arr[3]=15;
		arr[4]=18;
		int arr1[] = {2,6,10,15};
//		int arr4[] = {1,3,5};
//		int arr3[] = {2,4,6,7};
		if(CheckSortedArray.isArraySorted(arr) == true && CheckSortedArray.isArraySorted(arr1) == true)
		{
			MergeTwoSortedArray m = new MergeTwoSortedArray();
			int arr2[] = m.mergeTwoSortedArray(arr, arr1);
			for(int i : arr2)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}

}
