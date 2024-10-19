package generics;

public class GenericMethodMain {
	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
		
		Integer[] arr = {10,80,30};
		
		Integer arr2 = genericMethod.findMax(arr);
		
		System.out.println(arr2);
		
	}
	
}

