package object;

public class ObjectExMain {
	public static void main(String[] args) {
		ObjectEx ex1 = new ObjectEx("홍길동");
		ObjectEx ex2 = new ObjectEx("홍길동2");
		
		System.out.println(ex1);
		System.out.println(ex2);
		
		System.out.println(ex1.equals(ex2));
		
	}
}
