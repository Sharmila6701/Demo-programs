package practice;

public class Mathdemo {
public static void main(String[] args) {
	Mathdemo md = new Mathdemo();
	//md.math_func();
	//md.find_sqroot(81);
	//md.find_floor(63.5);
	//md.find_min(10,5);//same for find maximum logic
  //  md.find_pow(10,3);
//	int sign = md.find_sign(6);
//	System.out.println(sign);
	
    md.find_roundof(89.4);
}

private void find_roundof(double d) {
	// TODO Auto-generated method stub
	double d1 = d-(int)d;
	//System.out.println(d1);
	if(d1<.5) {
		System.out.println((int)d);
		
	}
	else {
		System.out.println((int)d+1);

	}
}

private int find_sign(int num) {
	// TODO Auto-generated method stub
	if(num>0) {
		return 1;
	}
	else if(num<0) {
		return -1;
	}
	else {
		return 0;
	}
}

private void find_pow(int a, int b) {
	// TODO Auto-generated method stub
	int p = 1;
	while(b>0) {
		p = p*a;
		b = b-1;
		
	}
	System.out.println("The pow is"+p);
}

private void find_min(int num1, int num2) {
	// TODO Auto-generated method stub
	if(num1<num2) {
		System.out.println(num1);
	}
		else {
			System.out.println(num2);
		}
	}


private void find_floor(double num) {
	// TODO Auto-generated method stub
	System.out.println(num);
int no=	(int)num;//type casting
System.out.println(no);
}

private void find_sqroot(int num) {
	// TODO Auto-generated method stub
	int div=2;
	while(div<=num/2) {
		if(num/div==div) {
			System.out.println("sqroot is"+div);
			break;
		}
		div=div+1;
	}
}

private void math_func() {
	// TODO Auto-generated method stub
	int num=-6;
	System.out.println(num);
	num=Math.abs(num);
	System.out.println(num);

	
	double d1 = 1.2;
	d1=Math.ceil(d1);
	System.out.println(d1);
	
	double d2= 1.2;

	d2=Math.floor(d2);
	System.out.println(d2);
	
	d1=Math.pow(2, 5);
	System.out.println(d1);
}
}
