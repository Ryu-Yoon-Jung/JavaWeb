package lang.object.poly;

public class MainTest {

	public static void main(String[] args) {

		Dog dog = new Dog("dd", 12);
		action(dog);
		
	}
	
	
	private static void action(Object obj) {
		
		if(obj instanceof Dog dog) {
			dog.sound();
		} else if (obj instanceof Car car) {
			car.move();			
		}
	}
	
}
