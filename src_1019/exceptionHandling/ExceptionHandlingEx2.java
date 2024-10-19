package exceptionHandling;

public class ExceptionHandlingEx2 {
	
	public static int divide(int a, int b) throws ArithmeticException{ // 어디로 예외 위임할지 지정하는 부분
		if(b == 0){
			throw new ArithmeticException("나눌 수 없는 숫자 입니다"); // 예외를 발생시키는 구문
		}
		return a/b;
	}
	
	
}
