package generics;

public class DataProcessorMain{
	
	public static void main(String[] args) {
		DataProcessor<String> dataProcessor = new DataProcessor<>();
		
		dataProcessor.processData("웹개발");
		
		DataProcessor<Integer> dataProcessor2 = new DataProcessor<Integer>(); 
		dataProcessor2.processData(123);

		
	}	
}
