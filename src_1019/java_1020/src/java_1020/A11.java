package java_1020;

import java.util.Optional;

public class A11 {

	public static void main(String[] args) {
		Optional<String> isThiNull = getSomeString();
		
		isThiNull.ifPresent(str -> System.out.println(str.toUpperCase()));
		
		
		Optional<String> nonNullOption = Optional.of("HELLO");
		Optional<String> nullableOptional = Optional.ofNullable(null);
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(nonNullOption);
		System.out.println(nullableOptional);
		System.out.println(emptyOptional);
		
		
		
		
		
		
		
		
		
	}
	
	// Optional 클래스 : null처리할때 발생할 수 있는 오류(=NULL POINTER 익셉션)를 방지 하고 처리
	private static Optional<String> getSomeString(){
		return Optional.empty();
	}
	
	
	
}
