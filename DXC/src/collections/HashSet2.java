package collections;
import java.util.*;

public class HashSet2 {
	public static void main(String args[]) {
		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		set.add("raju");
		set.add("ravi");
		boolean didAdd = set.add("raju");
		System.out.println(didAdd);
		set.add("renu");
		 didAdd = set.add("abhi");
		 System.out.println(didAdd);
		//traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
