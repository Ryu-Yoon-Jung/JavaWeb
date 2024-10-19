package enumType;

// 예제 2 : Enum을 사용해서 상품의 상태 관리하기 

// 요구사항
// ProductStatus enum을 정의해서 IN_STOCK, OUT_OF_STOCK, DISCOUNTED 상태를 정의
// Product 클래스 정의하여 상품 이름과 상태를 저장 (매개변수 있는 생성자로 초기화)
// Product 객체를 생성하고 상태 출력하는 프로그램 작성 (toString 오버라이딩) 
 
public enum ProductStatus {
	IN_STOCK, OUT_OF_STOCK, DISCOUNTED // 상품 상태를 상수값으로 관리   
}

class Product{
	private String name;
	private ProductStatus status;
	
	public Product(String name, ProductStatus status) {
		super();
		this.name = name;
		this.status = status;
	}
	
	public void printStatus() {
		System.out.println(name + ", 상태값: "+ status);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", status=" + status + "]";
	}
	
	
	
	
}




