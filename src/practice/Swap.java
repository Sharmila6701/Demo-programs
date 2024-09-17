package practice;

import java.util.Scanner;

public class Swap {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int first = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int second = scanner.nextInt();

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        first = first ^ second;
	        second = first ^ second;
	        first = second ^first;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	    }
	}



