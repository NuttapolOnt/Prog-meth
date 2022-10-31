package entity;

import entity.base.*;
import logic.GameController;
import logic.Sprites;

public class ColorBox extends Entity implements Interactable{
	
	private boolean activeBool;
	
	public ColorBox(boolean activeBox) {
		setActiveBool(activeBox);
	}
	
	public int getSymbol(){
		if(activeBool) {
			return Sprites.BOX_RED;
		}
		return Sprites.BOX_BLUE;
	}
	
	public boolean interact(Entity e) {
		boolean ans = false;
		if(GameController.getGameSwitchStatus() == activeBool) {
			ans = super.move(e.getDirection());
		}
		return ans;
	}

	public boolean isActiveBool() {
		return activeBool;
	}

	public void setActiveBool(boolean activeBool) {
		this.activeBool = activeBool;
	}
	

}
