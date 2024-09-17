package practice;

abstract class Shape{
	abstract void msg();
}

class Circle extends Shape{

	@Override
	void msg() {
		// TODO Auto-generated method stub
		System.out.println("circle");
	}
	
}
class Rectangle extends Shape{

	@Override
	void msg() {
		// TODO Auto-generated method stub
		System.out.println("rectangle");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		Shape cc = new Circle();
		Shape rr = new Rectangle();
		cc.msg();
		rr.msg();
	}

}
