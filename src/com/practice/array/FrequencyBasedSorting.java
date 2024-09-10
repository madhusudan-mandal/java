package com.practice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Sort the given array based on frequency of each element
public class FrequencyBasedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 3, 2, 8, 2, 2, 7, 4, 4};
		frequencyBasedSorting(arr);
			
	}

	private static void frequencyBasedSorting(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		for(int x: arr)
		{
			l.add(x);
		}
		Map<Integer,Integer> m = new LinkedHashMap<>();
		for(int a : arr)
		{
			if(m.containsKey(a)== false)
			{
				m.put(a, 1);
			}
			else
			{
				m.replace(a, m.get(a)+1);
			}
		}
		UserComparator uc = new UserComparator(m);
		Collections.sort(l, uc);
		System.out.print("[");
		for(int a: l)
		{
			System.out.print(a + ", ");
		}
		System.out.println("]");
		System.out.println(l);
	}

}

class UserComparator implements Comparator<Integer>
{
	private Map<Integer, Integer> map;
	UserComparator(Map<Integer, Integer> map)
	{
		this.map = map;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(map.get(o1) == map.get(o2))
		{
			return o1 - o2;
//			return o2 - o1;
		}
		else
		{
			return map.get(o1)-map.get(o2);
//			return map.get(o2)-map.get(o1);
		}
	}
	
}
