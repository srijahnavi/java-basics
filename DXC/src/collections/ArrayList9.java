package collections;

import java.util.*;

public class ArrayList9 {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("janu");
		al.add("banu");
		al.add("rethu");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("janu");
		al2.add("apple");
		al2.add("rethu");
		
		al.retainAll(al2);
		
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
