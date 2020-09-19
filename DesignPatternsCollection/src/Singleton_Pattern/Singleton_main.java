package Singleton_Pattern;

public class Singleton_main {
	
	public static void main(String[] args) {
		
		//First Init the class
		Message.getInstance().PrintMessage();
		
		//After they use same instance and not creating a new.
		Message.getInstance().PrintMessage();
		Message.getInstance().PrintMessage();
		
		//Removing the Instance and call Print.
		Message.getInstance().DestoryInstance();
		Message.getInstance().PrintMessage();

	}

}
