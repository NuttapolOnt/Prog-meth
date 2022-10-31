package Character;

public class Player {
	
	private String name;
	private String rightURL;
	private String leftURL;
	private int stamina;
	
	public Player(String Name) {
		setName(Name);
		setStamina(100);
		rightURL = "\\res\\Player_right.png";
		leftURL = "\\res\\Player_left.png";
	}
	
	public void interact(int point) {
		setStamina(getStamina() + point);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		if(stamina < 0) {
			stamina = 0;
		}
		else if(stamina > 100) {
			stamina = 100;
		}
		this.stamina = stamina;
	}
	
	public String getLeftURL() {
		return leftURL;
	}
	
	public String getRightURL() {
		return rightURL;
	}
	
	
}
