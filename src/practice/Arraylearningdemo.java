package practice;

import java.util.ArrayList;

public class Arraylearningdemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(4);
		al.add(6);
		al.add(9);
		al.add("sharmi");
		al.add("sanjay");
		al.add('s');
		al.add(3,"ss");
		System.out.println(al);
		System.out.println(al.contains("sharmi"));
		System.out.println(al.get(4));
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.get(5));
		System.out.println(al);




 	}
	

}
