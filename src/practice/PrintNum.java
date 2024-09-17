package practice;

public class PrintNum {
public static void main(String[] args) {
	PrintNum pn = new PrintNum();
	print_numbers(1);
	bb();
	sumofdigits(1);
	System.out.println(result);
}

static void print_numbers(int num) {
	// TODO Auto-generated method stub
	   if(num>10) {
		   return;
	   }
		int num1=(num<=10)?num:(num+1);
		System.out.println(num1);
		print_numbers(num+1);
		
	
	
}
static void bb() {
	System.out.println("hello");
}



static int result =0;
 static void sumofdigits(int n) {
     if(n>10) {
    	 return;
     }
     
     result+=n;
     
     sumofdigits(n+1);
 }
 
}

