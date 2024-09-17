package practice;

public class Store {
	static String storeName="Ramco";
	int price;
	int discount;
	
	public static void main(String[] args) {
		Store p1 = new Store();
		Store p2 = new Store();
		Store p3 = new Store();
		Store p4 = new Store();
		
		p1.price = 500;
		p1.discount = 85;
		p2.price = 400;
		p2.discount = 40;
		p2.bill();
		int actualPrice=p2.sell();
		System.out.println("Actualprice is" +actualPrice);
		p1.sell();
        Store.lift();
        


	}
	
	    static void lift() {
	    
		System.out.println("lift 1");
		//System.out.println(this.discount);
	}
	int sell() {
		int discount=10;
//		System.out.println(price);
//		System.out.println(discount);
//		System.out.println(this.discount);//munadi this.discount intha line kudukla appo enachunu local variable oda discount mattum print anuchu but actual object discount therla ;intha line this k.w antha particular obj kana disc eduthutu varuthu

		System.out.println(this.price - this.discount);
	    return this.price - this.discount;
	}
	
	void bill() {
		
	}


}
