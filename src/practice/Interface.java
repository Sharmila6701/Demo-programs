package practice;

interface Rules{
	int number = 10;
	void visitingTime();
	
	void lunchTime();
	
	void playTime();
}

interface officeRules{
	void entrance();
}

public class Interface implements Rules,officeRules {
	public static void main(String[] args) {
		Interface in = new Interface();
//		Rules rr =  new Interface();
//		rr.lunchTime();
		
		
		in.visitingTime();
		in.lunchTime();
		in.playTime();
		in.entrance();
		//in.number=15;
		//System.out.println(Interface.number);
		System.out.println(Rules.number);

	}

	@Override
	public void visitingTime() {
		// TODO Auto-generated method stub
		System.out.println("morning");
	}

	@Override
	public void lunchTime() {
		// TODO Auto-generated method stub
		System.out.println("Afternoon");
	}

	@Override
	public void playTime() {
		// TODO Auto-generated method stub
		System.out.println("evening");
		
	}

	@Override
	public void entrance() {
		// TODO Auto-generated method stub
		System.out.println("officegate");
	}

}
