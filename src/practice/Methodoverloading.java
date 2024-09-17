package practice;

class maths{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
}

public class Methodoverloading {
	public static void main(String[] args) {
		maths mm = new maths();
		System.out.println(mm.add(5, 5));
		System.out.println(mm.add(5, 5,5));
        System.out.println(mm.add(4.2, 4.2));
	}
	

}
