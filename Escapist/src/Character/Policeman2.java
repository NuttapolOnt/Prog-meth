package Character;

public class Policeman2 extends Unit{
	
	public Policeman2() {
		super("Mahone", "\\res\\Policeman.png");
	}
	
	public String getConversation() {
		if(Trust < 80) {
			return "Stay away from this room";
		}
		return "Don't steal anything from this room";
	}
	
	public void interact(int point) {
		super.setTrust(getTrust() + point);
	}
}
