package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Apple", 1000);
		hashMap.put("Banana", 150);
		hashMap.put("Cherry", 200);
		
		//System.out.println(hashMap.get("Apple"));
		//System.out.println(hashMap.get("Banana"));
		//System.out.println(hashMap.get("Cherry"));
		
		//System.out.println(hashMap);
		//hashMap.remove("Apple");
		//System.out.println(hashMap);
		
//		for (String key : hashMap.keySet()) {
//			System.out.println(key);
//			System.out.println(hashMap.get(key));
//		}
		
		Scanner scanner = new Scanner(System.in);
		String next =  scanner.next();
		System.out.println("next : " + next);
		
		String nextLine = scanner.nextLine();
		System.out.println("nextLine : " + nextLine);
		
	}
}
