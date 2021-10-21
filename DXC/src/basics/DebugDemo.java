package basics;

public class DebugDemo {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("DebugDemo--main");
		int sum = calc.add(10,20);
		System.out.println("The sum is--" +sum);
		//student jahnavi = new student("jahnavi",123);
		//student my student = new student ("jahnavi");
		//student yourstudent = new student("jahnavi);
		for(int a=0; a<5; a++) {
			int j = a*2;
			int f = a+ 5 *3 +j;
			System.out.println("the no is="+f);
			
		}
		
	}

}
