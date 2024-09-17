package practice;
class kalai{
	int age=43;
	void kk() {
		System.out.println("my mom");
	}
}
class Sharmi extends kalai{
	int age1=23;
	void ss() {
		System.out.println("child");
	}
}

public class Inheritance {
public static void main(String[] args) {
	Sharmi ss = new Sharmi();
	ss.kk();
	ss.ss();
	System.out.println("age is:"+ss.age);
}
}
