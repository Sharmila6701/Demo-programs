package practice;

import java.util.Scanner;

public class factorialprgm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int fact=sc.nextInt();
	int total=1;
	for(int i=fact;i>=1;i--){
	    total*=i;
	}
	System.out.println(total);

}
}
