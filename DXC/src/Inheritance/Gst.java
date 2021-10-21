package Inheritance;

public class Gst extends IncomeTax{
	
	/**
	 * to give a new definition to calculeTax method 
	 */
	@Override 
	int calculateTax(int income) {
		//TODO Auto-generated method stub
		int tax = super.calculateTax(income);
		if(income > 10000) {
			 tax = income/5;
		}
		return tax;
		
		
		
	}

}
