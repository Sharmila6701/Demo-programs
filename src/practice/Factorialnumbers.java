package practice;

import java.util.Scanner;

public class Factorialnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int t=sc.nextInt();
//		int fact=calculatefact(t);
//		System.out.println(fact);

		
		while(t>0) {
			int n=sc.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
				System.out.println(fact);

			
		}
		
		
		
	}

//public static int calculatefact(int t) {
//	int fact=1;
//	for(int i=1;i<=t;i++) {
//		fact*=i;
//		
//	}
//	return fact;
//		
//	}
//		
		
		
		
		
		

	

}
