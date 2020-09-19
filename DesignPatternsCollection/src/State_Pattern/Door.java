package State_Pattern;

public class Door {

	public static void main(String[] args) {
		Context context = new Context();
		
		OpenDoor opendoor = new OpenDoor();
		opendoor.doAction(context);
		
		ClosingDoor closingdoor = new ClosingDoor();
		closingdoor.doAction(context);
	}

}
