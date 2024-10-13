package lang.wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
//		Integer newInteger = new Integer(10); 
		Integer integerObj = Integer.valueOf(10); 
		
		Long long1 = Long.valueOf(100);
		Double double1 = Double.valueOf(10.5);
		
//		System.out.println("newInteger : " + newInteger);
//		System.out.println("integerObj : " + integerObj);
//		System.out.println("long1 : " + long1);
//		System.out.println("double1 : " + double1);
	
		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue();
		System.out.println(intValue);
		long longValue = long1.longValue();
		System.out.println(longValue);
		
		System.out.println("비교");
//		System.out.println("==:" + (newInteger == integerObj));
//		System.out.println("equals:" + newInteger.equals(integerObj));
		
	}
	
}
