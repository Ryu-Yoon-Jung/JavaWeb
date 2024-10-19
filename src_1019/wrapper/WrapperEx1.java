package wrapper;

import java.util.ArrayList;

public class WrapperEx1 {
	
	public static void main(String[] args) {
		Integer integer = 10; // 오토박싱0
		
		int a = Integer.valueOf(10); // 오토언박싱
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		numberList.add(integer);
		numberList.add(20);
		
		System.out.println(numberList.get(0));
		int sum = numberList.get(0) + numberList.get(1);
		
		System.out.println("sum:" + sum);
		
	}
	
}
