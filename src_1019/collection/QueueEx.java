package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); 
		LinkedList<String> linkedList = new LinkedList<>(); 
				
		queue.add("First");		
		queue.add("Seconde");		
		queue.add("Third");
		queue.add("Fourth");

//		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			String item = queue.poll(); // 큐 첫번째 요소 제거 후 반환
			System.out.println(item);
			System.out.println("--");
			
		}
		
	}
}
