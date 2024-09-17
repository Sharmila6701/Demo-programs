package practice;

import java.util.Arrays;

public class Arraydemo {
//	String name;
//	public Arraydemo(String name) {
//		this.name=name;
//	}

	public static void main(String[] args) {
//		int[] a = {5,8,4,6};
//		int[] b = {3,2,7,1};
//		System.out.println(Arrays.equals(a,b));
//		Arrays.sort(b);
//		System.out.println(b);
//		
//		Arraydemo ad1 = new Arraydemo("sharmi");
//		Arraydemo ad2 = new Arraydemo("lali");
//		Arraydemo ad3 = new Arraydemo("bose");
//		
//		Arraydemo[] ad = {ad1,ad2,ad3};
//		Arrays.sort(ad);
		
		String[] name= {"sharmi","lali","kalai"};
		//Arrays.sort(name);
		Compdemo cd = new Compdemo();
		Arrays.sort(name,cd);
		for(String i:name)
			System.out.println(i);
	}

}
