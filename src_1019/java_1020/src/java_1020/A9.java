package java_1020;

import java.util.ArrayList;
import java.util.List;

public class A9 {

	public static void main(String[] args) {
		List<String> es = new ArrayList<>();
		
		es.add("public");
		es.add("public2");
		es.add("public3");
		
		es.stream().forEach(str -> System.out.println(str));
		
	}
		
}
