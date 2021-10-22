package overloading;

public class Adder {
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(5,7));
		System.out.println(add(8,9,2));
	}

}
