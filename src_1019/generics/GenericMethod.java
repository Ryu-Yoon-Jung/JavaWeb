package generics;

public class GenericMethod {
	
	public static <T extends Comparable<T>> T findMax(T[] array) {
		T max = array[0];
		
		for (T item : array) {
			if(item.compareTo(max) > 0) { // 현재 배열의 요소값이 0보다 크면
				max = item; // 최대값을 갱신함
			}			
		}
		return max;
		
	}
	
}

