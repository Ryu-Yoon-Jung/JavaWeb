package immutable;


// 
public class ImmutablePersonMain {
	public static void main(String[] args) {
		ImmutablePerson immutablePerson = new ImmutablePerson("홍기리동", 18);
		
		
		int age = immutablePerson.getAge();
		age = 15;
		
		System.out.println(age);
		
		ImmutablePerson im = immutablePerson.withName("홍길동222", 123);
		
		
	}
}
