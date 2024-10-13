package lang;

public class LangMain {

	public static void main(String[] args) {
			
		UserV1 userV1 = new UserV1("12");
		UserV1 userV2 = new UserV1("12");
		
		
//		String str1 = userV2.id;
//		String str2 = userV2.id;

//		System.out.println(userV1 == userV2);
		
//		System.out.println(str1.equals(str2));
		
		System.out.println(userV1.equals(userV2));
		
	}

}
