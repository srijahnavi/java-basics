package collections;
import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("janu");
		stack.push("priya");
		stack.push("bhanu");
		stack.push("jonny");
		stack.push("nani");
		stack.pop();
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	

}
