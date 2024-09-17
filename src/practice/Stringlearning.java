package practice;

public class Stringlearning {
	String name;
	int id;
	public Stringlearning(String name,int id) {
		this.name= name;
		this.id=id;
	}
    
	public String toString() {
		return ""+this.id;//concat paniruke i wnat only number of 6
	}
	public static void main(String[] args) {
//		String ss = new String("ab");
//		System.out.println(ss.hashCode());
//		
//		String sss = "a";
//		System.out.println(sss.hashCode());
		
//		Stringlearning sl =  new Stringlearning("shar",6);
//		System.out.println(sl);
		
		String ss = new String("sharmila udhai");
		//System.out.println(ss.length());
		int i=0;
		int count=0;
		while(i<ss.length()) {
			char ch = ss.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			//System.out.println(ss.charAt(i));
		
				
			count++;
            i++;
		
	}
		System.out.println(count);

}
}