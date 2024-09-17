package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
	public static void main(String[] args) {
		Mobile realme =  new Mobile(19789700,47);//normal oru 3 object create pani param pass paniruken
		Mobile infinix =  new Mobile(49839,16);
		Mobile oppo =  new Mobile(891929,29);
		
		ArrayList<Mobile> MobileList = new ArrayList<Mobile>();
        MobileList.add(realme);
        MobileList.add(infinix);
        MobileList.add(oppo);
         
        System.out.println("before sort"+MobileList);

        Comparatorint ci = new Comparatorint();
      Collections.sort(MobileList,ci);
       Mobile mob = new Mobile(); 
        System.out.println("after sort"+mob);
	
//		ArrayList al = new ArrayList();
//		al.add(5);
//		al.add(6);
//		al.add(1);
//		al.add(4);
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
//		System.out.println(Collections.binarySearch(al, 6));
	}

}
