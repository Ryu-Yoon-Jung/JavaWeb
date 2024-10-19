package collection;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList를 사용해서 사용자 입력을 받고 목록 관리하는 프로그램
// scanner 객체로 사용자 입력받은 값을 ArrayList에 담아서 출력해보세요

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		// 3개 입력받기
		
		for(int i = 0; i < 3; i++) {
			String item = scanner.nextLine();
			arrayList.add(item);
		}
		System.out.println(arrayList);
		
	}
	
}
