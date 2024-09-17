package practice;
class parent{
	void message() {
		System.out.println("welcome");
	}
}
class child1 extends parent{
	void msg() {
		System.out.println("cooking");
	}
}
class child2 extends parent{
	void display() {
		System.out.println("playing");
	}
}
class child3 extends child2{
	
}

public class Methodoverriding {
	public static void main(String[] args) {
//		parent cc = new child();
//		cc.msg();
		
		child3 cc = new child3();
		cc.message();
	}

}
