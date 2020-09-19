package Singleton_Pattern;

public class Message {
	
	//Out Instance we get after first call.
	private static Message messageInstance;
	
	//Constructor
	private Message() {}
	
	//Checking if instance is created.
	public static Message getInstance() {
		if(messageInstance == null) {
			messageInstance = new Message();
			System.out.println("Message is created.");
		}
		return messageInstance;
	}
	
	//Printing.
	public void PrintMessage() {
		System.out.println("Inside print of Message.");
	}
	
	public void DestoryInstance() {
		if(messageInstance != null) {
			messageInstance = null;
		}
		System.out.println("Message is destoryed.");
	}
}
