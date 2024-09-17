package practice;

public class Loop {
public static void main(String[] args) {
	Loop lp = new Loop();
	int num =22;
    int result=	lp.find_reverse(num);
	System.out.println("reversed num is" + result);
	if(num==result) {
		System.out.println("Plaindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}

private int find_reverse(int num) {
	// TODO Auto-generated method stub
	int sum=0;
	while(num>0) {
		int rem=num%10;
	    sum=(sum*10)+rem;
		num=num/10;
	}
	return sum;
	//System.out.println(sum);
}
}
 