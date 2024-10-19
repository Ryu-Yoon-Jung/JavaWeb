package immutable;


// 불변객체 : final로 선언하고 setter메서드가 없습니다 (=객체 불변하게 함)
public class ImmutablePerson {
	private final String name;
	private final int age;
	
	public ImmutablePerson withName(String name, int age) {
		return new ImmutablePerson(name, age);
	}

	public ImmutablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
	
}
