package object;


// 예제1 : 다양한 객체를 Object 타입으로 참조하고 toString 을 통해서 각각의 객체 정보 출력하기

// 요구사항
// Shape 클래스 정의해서 도형의 종류를 저장
// Shape 객체를 Object 타입으로 참조
// toString() 메서드를 오버라이딩 해서 도형 정보를 출력

// 두 도형의 정보 출력하는 프로그램

public class Shape {
	private String type; // 도형 종류 저장하는 type 필드

	public Shape(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shape [type=" + type + "]";
	}
	
}
