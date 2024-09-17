package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Setdemo {
	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add("shar");
		ll.add("shar");
		ll.add(40);
		System.out.println(ll);
		
		LinkedHashSet lhs = new LinkedHashSet(ll);
		System.out.println(lhs);
		
		
		
		
		
//		LinkedHashSet hs = new LinkedHashSet();
//		hs.add(1);
//		hs.add(2);
//		hs.add(3);
//		hs.add(4);
//		hs.add("sanj");
//		hs.add("shar");
//		System.out.println(hs)
	}

}
