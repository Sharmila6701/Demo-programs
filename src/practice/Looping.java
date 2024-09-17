package practice;

public class Looping {
	public static void main(String[] args) {
		Looping loopobj = new Looping();
		loopobj.count_divisor(100);
	}
	//	loopobj.find_primenum(3);
	

	//private void find_primenum(int num) {
//		// TODO Auto-generated method stub
//		int div=2;
//		int count=0;
//		
//		while(div<num) {
//			if(num%div==0) {
//				System.out.println(div);
//				count=count+1;
//				
//			}
//			div=div+1;
//		}
//		System.out.println("count is:"+count);
//		if(count==0) {
//			System.out.println("primenum");
//	}
//		else
//			System.out.println("not a prime num");

	private void count_divisor(int num) {
	// TODO Auto-generated method stub
		int div=2;
     	int count=0;
	
     	while(div<num) {
			if(num%div==0) {
				System.out.println(div);
				count=count+1;
				
			}
			div=div+1;
		}
		System.out.println("count is:"+count);
	


}
}