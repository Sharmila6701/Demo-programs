package practice;

public class Box {
	int size;
	String colour;
	static String owner="sharmi";//common object for all boxes
	
	
	public static void main(String[] args) {
		Box BlackBox =  new Box();//allocates memory
		Box GreenBox =  new Box();
		BlackBox.size=5;
		System.out.println(BlackBox.size);
		
		System.out.println(Box.owner); //three approaches for accessing a static variable 
		System.out.println(BlackBox.owner);
		System.out.println(owner);
	}

}
