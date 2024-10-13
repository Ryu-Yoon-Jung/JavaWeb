package lang.object.poly;

public class Dog {
	
	private String name;
	private int age;
	
	public void sound() {
		System.out.println("멍멍");
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "강아지이름 : " + name + "강아지 나이 : " + age;  
	}
	
}
