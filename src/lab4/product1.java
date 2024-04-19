package lab4;

public class product1 {
	public static void main(String[] args) {
		Product test = new Product();
		
		Product pr1 = test.nhapThongTin("computer", 300, 0.1);
		Product pr2 = test.nhapThongTin("laptop",500, 0.2);
		
		test.xuatThongTin(pr1);
		double tax = test.getTaxPrice(pr1.getPrice(), pr1.getTax());
		System.out.println("tax = " + tax);
		
		test.xuatThongTin(pr2);
		System.out.println("tax = " + test.getTaxPrice(pr2.getPrice(), pr2.getTax()));
		
	}
}
