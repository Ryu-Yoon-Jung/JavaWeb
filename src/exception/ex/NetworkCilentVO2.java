package exception.ex;

public class NetworkCilentVO2 {
	
	private final String address;
	public boolean connectError;
	public boolean sendError;
	
	
	public NetworkCilentVO2(String address) {
		this.address = address;
	}
	
	// 서버 연결하는 메서드 (+ 데이터값이 유효한지 inintError()로 확인) 
	public String connect(String data) {
		initError(data);
		
		if(connectError) {
			System.out.println(address + "서버연결 실패");
			return "connectError";
		}		
		
		System.out.println(address + "서버 연결 성공");
		return "success";
	}
	
	public String send(String data) {
		if(sendError) {
			System.out.println(address + "서버 데이터 전송 실패 " + data);
			return "sendError";
		}
		
		System.out.println(address + "서버에 데이터 전송" + data);
		return "success";
		
	}
	
	// 연결해제
	public void disconnect() {
		System.out.println(address + "서버연결해제");
	}
	
	// 초기화 에러 (이상한 데이터값 받았을때 오류 발생)
	public void initError(String data) {
		if(data.contains("error1")) {
			connectError = true;// 연결에러상태
		}
		if(data.contains("error2")) {
			sendError = true; // 데이터 전송에러
		}		
	}
	
	
}
