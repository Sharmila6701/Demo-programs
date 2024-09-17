package practice;

public class Greatestdiv {
	public static void main(String[] args) {
		Greatestdiv gd = new Greatestdiv();
		gd.findgreatestdivisor(100);
		gd.findsmallestdivisor(49);

	}

	private void findsmallestdivisor(int num) {
		// TODO Auto-generated method stub
		int div=2;
		int smallest=-1;
		while(div<=num/2) {
			if(num%div==0) {
				smallest=div;
				break;
			}
			div=div+1;
		}
		System.out.println("Smallestdiv:" + smallest);
	}

	private void findgreatestdivisor(int num) {
		// TODO Auto-generated method stub
		int div=2;
		int greatest=-1;
		while(div<=num/2) {
			if(num%div==0) {
				greatest = div;
			}
			div = div+1;
		}
		System.out.println("Greatestdiv:"+greatest);
	}

}
