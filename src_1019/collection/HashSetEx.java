package collection;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Python");
		set.add("Java");
		
		System.out.println(set);
		
		for (String str : set) {
//			System.out.println(str);
		}
		
//		System.out.println(set.contains("Pythons")); 
		
	}
}
