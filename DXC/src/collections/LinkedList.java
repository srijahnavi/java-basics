package collections;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
	public static void main(String[] args) {
		List<String> al = new java.util.LinkedList<>();
		al.add("Sweety");
		al.add("Hotty");
		al.add("janu");
		al.add("sravs");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		
	}

		
	}


