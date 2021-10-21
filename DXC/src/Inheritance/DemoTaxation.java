package Inheritance;

public class DemoTaxation {
	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax();
		Gst gst = new Gst();
		int tax = gst.calculateTax(22000);
		System.out.println("tax is"+tax);
	}

}
