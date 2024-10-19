package exceptionHandling;

public class ExceptionHandlingEx1 {
	
	public static void main(String[] args) {
		
		try {  // 예외(=오류)발생 가능성 코드를 try블록 안에 작성
//			int result = 10/0; // ArithmeticException 발생
			int result = 10/2; // ArithmeticException 발생
			System.out.println("Result:" + result);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			
		}finally {
			System.out.println("예외발생 상관없이 항상 실행");
		}
		
		System.out.println("프로그램 정상 흐름 동작으로 돌아감");
		
	} 
	
	
}
