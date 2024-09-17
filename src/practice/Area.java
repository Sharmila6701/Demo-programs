package practice;

public class Area {
	public static void main(String[] args) {
		Area square = new Area();
		Area triangle = new Area();
		int result=square.cal(20);
		System.out.println(result);
		int result1=triangle.cal(20,5);
		System.out.println(result1);
	}
	int cal(int a) {
		return a*a;
	}
	
	int cal(int a,int b) {
		return a*b;
	}

}
