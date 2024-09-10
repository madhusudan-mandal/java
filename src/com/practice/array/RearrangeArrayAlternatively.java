package com.practice.array;


/*Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * */
import java.util.Random;

public class RearrangeArrayAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,7,9,8,4,10,15,13};
//		int[] arr = {1,2,3,4,5,6};
//		int[] arr1 = {13,2,15,6,10,7,4,9,8};
//		arr = rearrangeArrayAlternatively(arr, arr.length);
//		arr = rearrangeArrayAlternativelyWithOutTakingExtraSpace(arr, arr.length);
		arr = rearrange(arr, arr.length);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

	/*Time Complexity: O(n+n) for unsorted array
	 * Space Complexity: O(1)
	 * */
	public static int[] rearrange(int A[], int N){
	    int max_idx = N - 1, min_idx = 0;
	    int mx = -1;
	    int j=0;
	    while(j<N)
	    {
	    	if(mx<A[j])
	    		mx=A[j];
	    	j++;
	    }
	    mx += 1;
	    for (int i = 0; i < N; i++) {
	        if (i % 2 == 0) {
	            A[i] += (A[max_idx] % mx) * mx;
	            max_idx--;
	        }
	        else {
	            A[i] += (A[min_idx] % mx) * mx;
	            min_idx++;
	        }
	    }
	    for (int i = 0; i < N; i++)
	        A[i] = A[i] / mx;
	    
	    return A;
	}

//	private static int[] rearrangeArrayAlternatively(int[] arr, int length) {
//		// TODO Auto-generated method stub
//		 int temp[] = new int[length];
//	     int start = 0, last = length - 1;
//		for(int i=0;i<length;i++)
//		{
//			if(i%2==0)
//				temp[i]=arr[last--];
////				arr[i] = temp[last--];	
//			else
//			{
////				arr[i] = temp[start++];
//				temp[i] = arr[start++];
//			}
//		}
//		return temp;
//	}
//	private static int[] rearrangeArrayAlternatively(int[] arr, int length) {
//		// TODO Auto-generated method stub
//		String s=Integer.toString(arr[0]);
//		for(int i=1;i<length;i++)
//		{
//			s = s.concat(Integer.toString(arr[i]));
//		}
//		Random r = new Random();
//		for(int i=0;i<length;i++)
//		{
//			arr[i]= Integer.parseInt(s.valueOf(r.nextInt(s.length())));
//		}
//		return temp;
//	}

}
