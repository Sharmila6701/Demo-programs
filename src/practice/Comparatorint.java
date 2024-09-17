package practice;

import java.util.Comparator;

public class Comparatorint implements Comparator {

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Mobile m1=(Mobile)o1;
		Mobile m2 =(Mobile)o2;
		int rams=m1.ram%10;
		int ramu = m2.ram%10;
		if(rams>ramu)
			return 1;
		else if(rams<ramu)
			return -1;
		return 0;
	}

}
