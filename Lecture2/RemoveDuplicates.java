package Lecture2;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5, 5 };
		HashSet<Integer> set = new HashSet<Integer>();
		for(int k : arr) {
			set.add(k);
		}
		
		System.out.println(set);
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int k : arr) {
			if(!list.contains(k))
			list.add(k);
		}
		
		System.out.println(list);
	}

}
