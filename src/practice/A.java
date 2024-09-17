package practice;
class C extends Thread{
	public void run() {
		System.out.println("hii");
	}
	
}

public class A {
	public static void main(String[] args) throws InterruptedException {
		
		C cc = new C();
		cc.start();
		cc.start();

		for (int i=0;i<10;i++) {
			System.out.println("*");
		
		}
	}

}
