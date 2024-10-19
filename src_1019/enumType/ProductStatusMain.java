package enumType;
 
public class ProductStatusMain {
	public static void main(String[] args) {
		Product product = new Product("컴퓨터", ProductStatus.IN_STOCK);
		Product product2 = new Product("모니터", ProductStatus.OUT_OF_STOCK);
		Product product3 = new Product("마우스", ProductStatus.DISCOUNTED);
	
		product.printStatus();
		product2.printStatus();
		product3.printStatus();
		
		System.out.println(product);
		
	}
}




