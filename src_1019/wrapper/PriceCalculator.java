package wrapper;

// 예제 1 : Integer와 Double 을 사용해서 웹 애플리케이션에서 입력값을 처리하는 예제

// 요구사항
// PriceCalculator 클래스를 정의하여 제품 가격과 할인율 관리
// 제품 가격과 할인율을 Double타입으로 선언
// 할인율을 적용하여 최종 가격을 계산

// 계산된 최종 가격을 출력 

public class PriceCalculator {
	public static void main(String[] args) {
		// 제품 가격
		Double productPrice = 100.5; // 오토박싱
		
		// 할인금액
		Double discount = 10.0;
		
		// 오토언박싱을 통해 Double 객체가 다시 기본형 double로 변환된 후, 할인 적용하여 최종 가격 계산
		double finalPrice = productPrice - discount;
		
		
		// 최종 가격 출력
		System.out.println(finalPrice);
		
		
	}
}
