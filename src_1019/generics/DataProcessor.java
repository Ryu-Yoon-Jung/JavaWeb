package generics;

// 제네릭 클래스를 사용해서 다양한 타입의 데이터를 처리하세요

// DataProcessor 클래스를 정의하고 제네릭 T를 사용해서 객체 생성시점에 타입을 지정하도록 할 것
// processData 메서드 작성 : 데이터 처리
// String, Integer, Double 타입의 데이터를 처리하고 출력하세요

public class DataProcessor<T> {
	
	// processData 메서드 (알수없는 타입을 매개변수로 받아서 출력만 하는 메서드)
	public void processData(T data) {
		System.out.println("data: " + data);
	}
	
}
