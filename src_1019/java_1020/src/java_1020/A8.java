package java_1020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A8 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});
		
		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));
		
	}
}
