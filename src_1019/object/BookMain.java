package object;

public class BookMain {
	
	public static void main(String[] args) {
		Book book1 = new Book("자바의 정석", "남궁성");
		Book book2 = new Book("자바의 정석2", "남궁성2");
		Book book3 = new Book("자바의 정석2", "남궁성2");
		
		System.out.println(book1);
		System.out.println(book2);
		
		
		System.out.println(book1.equals(book2));
		System.out.println(book2.equals(book3));
		
	}
	
	
}
