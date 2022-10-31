package entity;

import entity.base.*;
import logic.Sprites;

public class Door extends Entity implements Interactable, Consumable{
	
	public int getSymbol() {
		return Sprites.DOOR;
	}
	
	public boolean interact(Entity e) {
		if(e.getSymbol() == Sprites.KEY) {
			return true;
		}
		return false;
	}
	
	public boolean consume(Entity e) {
		if(e.getSymbol() == Sprites.KEY) {
			super.remove();
			return true;
		}
		return false;
	}

}
