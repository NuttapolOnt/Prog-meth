package entity;

import entity.base.*;
import logic.GameController;
import logic.Sprites;

public class TrashCompactor extends Entity implements Interactable, Consumable, Updatable{
	
	private int cooldown;
	
	public TrashCompactor() {
		setCooldown(0);
	}
	
	public int getSymbol() {
		if(cooldown == 0) {
			return Sprites.COMPACTOR_ON;
		}
		return Sprites.COMPACTOR_OFF;
	}
	public boolean interact(Entity e) {
		if(super.isBox(e) && (cooldown == 0)) {
			return true;
		}
		return false;
	}
	
	public boolean consume(Entity e) {
		if(super.isBox(e) && (cooldown == 0)) {
			setCooldown(GameController.MAX_COOLDOWN_TIME);
			return true;
		}
		return false;
	}
	
	public void update() throws exception.IllegalValueException{
		if(cooldown > 0) {
			cooldown -= 1;
		}
		else if(cooldown < 0) {
			throw new exception.IllegalValueException();
		}
	}
	
	public void valueCorrection() {
		setCooldown(0);
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	
	
}
