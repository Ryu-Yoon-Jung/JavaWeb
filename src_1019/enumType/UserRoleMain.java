package enumType;

public class UserRoleMain{
	
	public static void main(String[] args) {
		User user = new User("홍길동", UserRole.USER);
		User admin = new User("홍길동2", UserRole.ADMIN);
		User guest = new User("홍길동3", UserRole.GUEST);
		
		user.printRole();
		admin.printRole();
		guest.printRole();
		
		
	}
	
}

