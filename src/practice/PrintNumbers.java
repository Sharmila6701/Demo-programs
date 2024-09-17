package practice;

public class PrintNumbers {
public static void main(String[] args) {
	print_num(1);
	ss();
}

 static void print_num(int num) {
	// TODO Auto-generated method stub
	if(num>10) {
		return;
	//	System.exit(0);
	}
		int number=(num<=10) ? num:num+1;
		System.out.println(number);
		print_num(num+1);
	
}
 static void ss() {
	 System.out.println("hiii");
 }
}
