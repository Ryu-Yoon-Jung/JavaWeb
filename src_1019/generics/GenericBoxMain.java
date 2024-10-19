package generics;

public class GenericBoxMain {
	public static void main(String[] args) {
		GenericBox1<Integer> box1 = new GenericBox1<>(123);
//		box1.printItem();
		
		GenericBox1<String> box2 = new GenericBox1<>("가가");
//		box2.printItem();
		
		
		GenericBox2<Integer> box22 = new GenericBox2<>(123);
		box22.setItem(1234);
		System.out.println(box22.getItem());
		
		GenericBox2<String> box23 = new GenericBox2<>("가가가");
		box23.setItem("나나나");
		
		System.out.println(box23.getItem());
		
	}
}
