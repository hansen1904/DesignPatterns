package State_Pattern;

public class ClosingDoor implements State {

	public void doAction(Context context) {
		System.out.println("The Door is closed");
		context.setState(this);
	}
}
