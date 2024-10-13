package exception.ex;

import java.util.Scanner;

public class MainVO {

	public static void main(String[] args) {
		
		NetworkServiceVO networkServiceVO = new NetworkServiceVO();
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 스캐너로 'exit' 입력하면 프로그램 종료되도록 
		while (true) {
			System.out.println("전송할 문자: ");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				break;
			}
			networkServiceVO.sendMessage(input);
			System.out.println();
		}
		System.out.println("프로그램 정상종료");
			
	}

}
