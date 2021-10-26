package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		ArrayList<String>fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("pineapple");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		
	}

}
