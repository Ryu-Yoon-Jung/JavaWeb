package enumType;

// Enum으로 사용자 권한 정의하고 사용
// UserRole enum을 정의하고 ADMIN, USER, GUEST 역할 정의
// User 클래스 정의하고 사용자 이름과 역할을 저장
// User 객체 생성하고 역할 출력하는 프로그램 작성

public enum UserRole {
	ADMIN, USER, GUEST
}

class User{
	private String name; // 사용자 이름 저장하는 필드
	private UserRole role; // role이라는 UserRole타입의 필드 선언 (= 사용자 역할을 저장할 예정) 	
	
	public User(String name, UserRole role) {
		this.name = name;
		this.role = role;
	}
	
	public void printRole() {
		System.out.println(name + " , s.role:" + role );
	}
	
	
}

