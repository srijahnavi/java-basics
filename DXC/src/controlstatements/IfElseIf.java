package controlstatements;

public class IfElseIf {
	public static void main(String[] args) {
		int number = -25;
		if (number > 0) {
			System.out.println("POSITIVE");
		}else if(number < 0) {
			System.out.println("NEGATIVE");
		}else {
			System.out.println("ZERO");
		}
	}

}
