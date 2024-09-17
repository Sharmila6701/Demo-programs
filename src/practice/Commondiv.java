package practice;

public class Commondiv {
public static void main(String[] args) {
	Commondiv cd = new Commondiv();
	cd.find_commondivisor(200,440);
}

private void find_commondivisor(int num1, int num2) {
	// TODO Auto-generated method stub
	int div=2;
 	
 	while(div<=num1 && div<=num2) {
		if(num1%div==0 && num2%div==0) {
			System.out.println(div);
			
		}
		div=div+1;
}
}
}