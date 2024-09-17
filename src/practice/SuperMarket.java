package practice;

public class SuperMarket {
	String name;
	int price;
	
	public SuperMarket(String s,int p) {
		this.name=s;
		this.price=p;
	}
	public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }


	public static void main (String[] args) {
		SuperMarket s1=new SuperMarket("kitkat",5);
		SuperMarket s2=new SuperMarket("perk",15);
		
		s1.display();
		s2.display();
		
		
		
		
		
		
		
	}

}
