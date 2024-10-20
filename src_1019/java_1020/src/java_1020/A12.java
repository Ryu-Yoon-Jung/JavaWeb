package java_1020;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A12 {

	public static void main(String[] args) {
		Integer[] interArr = new Integer[] {1,2,3,4,5,6,7};
		
		List<Integer> list = Arrays.asList(interArr);
		 
		List<Integer> eventList = list.stream()
				.filter(value -> value % 2 == 0)
				.collect(Collectors.toList());
		
		
		System.out.println(eventList);
	}
	
}
