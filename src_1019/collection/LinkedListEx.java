package collection;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> es = new LinkedList<>();
		
		es.add("First");
		es.add("Second");
		es.add("Third");
		
		es.addFirst("Zero");
		es.addLast("Last");
		
		System.out.println(es);
		
		for (String string : es) {
			System.out.println(string);
		}
		
	}
}
