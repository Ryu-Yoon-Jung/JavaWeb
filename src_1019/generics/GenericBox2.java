package generics;

// 제네릭 클래스 : 다양한 타입 데이터를 객체 생성시점에 저장하고 관리하기 위함

// 매개변수 있는 생성자
// getter, setter

public class GenericBox2<T>{
	private T item;

	public GenericBox2(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
