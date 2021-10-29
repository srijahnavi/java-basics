package design.patterns.factory;


import java.io.*;


public class GenerateBill {
	public static void main(String args[])throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of paln for which the bill be generated:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String planName= br.readLine();
		System.out.println("Enter the number of untis for bill will be calculated:");
		int units = Integer.parseInt(br.readLine());
		
		Plan Plan= planFactory.getPlan(planName);
		
		System.out.println("Bill amount for"+planName+"of"+units+"units is:");
		
		Plan.getRate();
		Plan.calculateBill(units);
	}

	}
