package lang.wrapper;

public class WrapperUtillMain {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 반환
		Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 반환
		
		System.out.println(i1.getClass());
		System.out.println(i2.getClass());
		int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환
		
				
//		System.out.println("sum :" + Integer.sum(10, 20));
//		System.out.println("min :" + Integer.min(10, 20));
//		System.out.println("max :" + Integer.max(10, 20));
		
		
		
	}

}
