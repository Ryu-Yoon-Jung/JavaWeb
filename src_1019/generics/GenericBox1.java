package generics;

public class GenericBox1 <T>{
	private T item;

	public GenericBox1(T item) {
		super();
		this.item = item;
	}
	
	public void printItem() {
		System.out.println("Item:" + item);
	}
	
}
