package entity;

import entity.base.*;
import logic.GameController;
import logic.Sprites;

public class Switch extends Entity implements Interactable, Updatable{
	
	private boolean isActive;
	
	public Switch() {
		setActive(GameController.getGameSwitchStatus());
	}
	
	public int getSymbol() {
		if(isActive) {
			return Sprites.SWITCH_ON;
		}
		return Sprites.SWITCH_OFF;
	}
	
	public boolean interact(Entity e) {
		if(e.getSymbol() == Sprites.PLAYER) {
			GameController.setGameSwitchStatus(!GameController.getGameSwitchStatus());
		}
		return false;
	}
	
	public void update() {
		setActive(GameController.getGameSwitchStatus());
	}
	
	public void valueCorrection() {}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
