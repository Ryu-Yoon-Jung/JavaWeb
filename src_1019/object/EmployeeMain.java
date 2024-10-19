
package object;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee("영수", 101);
		Employee employee2 = new Employee("영희", 102);
		Employee employee3 = new Employee("영희", 102);
		
		
		System.out.println(employee1.equals(employee2));
		System.out.println(employee2.equals(employee3));
		
		
	}
	
}
