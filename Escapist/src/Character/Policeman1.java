package Character;

public class Policeman1 extends Unit{
	
	public Policeman1() {
		super("Bratt", "\\res\\Policeman.png");
	}
	
	public String getConversation() {
		if(Trust < 80) {
			return "Don't do anything stupid tonight.";
		}
		return "I will go home tonight.";
	}
	
	public void interact(int point) {
		super.setTrust(getTrust() + point);
	}
}
