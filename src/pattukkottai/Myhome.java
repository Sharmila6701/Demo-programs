package pattukkottai;

public class Myhome {
	String name = "dog";
public static void main(String[] args) {
	Myhome mh = new Myhome();
	mh.opening();
	mh.bike();
	mh.entrance();
	System.out.println(mh.name);
	
}

 protected void entrance() {
	// TODO Auto-generated method stub
	System.out.println("parking");
}

private void bike() {
	// TODO Auto-generated method stub
	System.out.println("apache bike");
}

protected void opening() {
	// TODO Auto-generated method stub
	System.out.println("clean home sweet home");
}
 
}
