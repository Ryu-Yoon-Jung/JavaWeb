package collection;

import java.util.HashMap;
import java.util.Scanner;

// 앞에 예제랑 똑같이 3쌍 입력값 받아서
// 향상 포문에서 키-값 쌍으로 출력
public class HashMapEx1 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("키값 입력>");
			String keyInput = scanner.nextLine();
			
			System.out.println("val값 입력>");
			int vlauInput = scanner.nextInt();
			
			hashMap.put(keyInput, vlauInput);
		}
		
		System.out.println(hashMap);
		
	}
}
