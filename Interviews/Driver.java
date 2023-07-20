package in.ashokit.Interviews;

public class Driver {
	
	public static void main(String[] args) {
		Driver d =new Driver();
		Product p=new Product();
		p.productId=101;
		p.productName="Lux";
		p.productPrice=25.00;
		d.print(p);
	}
	
	void print(Product p) {
		System.out.println(p.productId+"==="+p.productName+"===="+p.productPrice);
	}

}


class Product{
	int productId;
	String productName;
	double productPrice;
}