package practice;
 class Parent{
	 void msg() {
		 System.out.println("parent says something...");
	 }
 }

public class Child extends Parent {
	
	void msg() {
		System.out.println("child says...");
	}
	
	void ss() {
		System.out.println("hiiiiiiiii");
		
	}
	public static void main(String[] args) {
		Parent cc = new Child();
		//Parent pp = new Parent();
		cc.msg();
		//pp.msg();
		
	}

}
