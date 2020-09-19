package State_Pattern;

public class OpenDoor implements State{
	
	public void doAction(Context context) {
		System.out.println("The Door is open");
		context.setState(this);
	}
}
