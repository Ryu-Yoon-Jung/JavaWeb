package java_1020;

public class A10 {

	public static void main(String[] args) {
		
		String isThisNull = getSomeString();
		//System.out.println(isThisNull.toUpperCase());
		
		if(isThisNull != null) {
			System.out.println(isThisNull.toUpperCase());
		}else {
			System.out.println("null");
		}
		
	}
	
	
	private static String getSomeString(){	
		return null; // 항상 null 반환
	}
	
	
}
