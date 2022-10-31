package Character;

public class Beros extends Unit{

	public Beros() {
		super("Beros", "\\res\\Beros.png");
	}
	
	public String getConversation() {
		if(Trust < 10) {
			return "Don't talk to me if you don't want to have any trouble";
		}
		if(Trust < 30) {
			return "Give me some food or go away from me";
		}
		if(Trust > 80) {
			return "How can I help you";
		}
		return "Hi, how are you";
	}
	
	public void interact(int point) {
		super.setTrust(getTrust() + point);
	}
}
