package practice;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = {5,7,9,3,1,6};
//		for(int i:arr) {
//			System.out.println(i);
			Arrays.sort(arr);
			for(int i:arr) {
				System.out.println(i);
			}
				
			String[] name = {"sharmi","kalai","lali"};
			Arrays.sort(name);
			for(String n:name) 
			System.out.println(n);
			
			Comparator cc = new ComparatorDemo();
			Arrays.sort(name,cc);
			
			for(String n:name) 
				System.out.println(n);
				
			}
		
	}


