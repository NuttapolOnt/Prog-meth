package Controller;

public class Item {
	
	private String name;
	private int type;
	private String imgURL;
	
	public Item(String name) {
		this.name = name;
		if(name.equals("Key")) {
			imgURL = "\\res\\tools\\Key.png";
			type = 1;
		}
		else if(name.equals("Shovel")) {
			imgURL = "\\res\\tools\\Shovel.png";
			type = 2;
		}
		else if(name.equals("Ladder")) {
			imgURL = "\\res\\tools\\Ladder.png";
			type = 3;
		}
		else if(name.equals("Knife")) {
			imgURL = "\\res\\tools\\Knife.png";
			type = 4;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getImgURL() {
		return imgURL;
	}
	
	public int getType() {
		return type;
	}
}
