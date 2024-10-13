package lang.object.toString;

import lang.object.poly.Dog;

public class MainTest2 {

	public static void main(String[] args) {
		Dog dog = new Dog("말티즈", 5);
		ObjectPrinter.print(dog);
		
		System.out.println(dog.toString());
		
	}

}
