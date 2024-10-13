package exception.ex;

public class NetworkServiceVO {
	public void sendMessage(String data) {
		
		String address = "http://example.com";
		NetworkCilentVO2 cilentVO2 = new NetworkCilentVO2(address);
		
		cilentVO2.connect(data);
		cilentVO2.send(data);
		cilentVO2.disconnect();
		
	}
}
