package Character;

public abstract class Unit {

	protected int Trust;
	protected String Name;
	protected String imgURL;
	
	public Unit(String Name, String URL) {
		setName(Name);
		setTrust(50);
		setImgURL(URL);
	}
	
	public abstract String getConversation();
	
	public abstract void interact(int point);

	public int getTrust() {
		return Trust;
	}

	public void setTrust(int trust) {
		if(trust >= 100) {
			trust = 100;
		}
		else if(trust < 0) {
			trust = 0;
		}
		Trust = trust;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void setImgURL(String URL) {
		imgURL = URL;
	}
	
	public String getImgURL() {
		return imgURL;
	}
	
	
}
