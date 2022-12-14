package entity;

import entity.base.Entity;
import entity.base.Interactable;
import logic.Sprites;

public class Box extends Entity implements Interactable{
	
	public int getSymbol() {
		return Sprites.BOX;
	}
	
	public boolean interact(Entity e) {
		boolean ans = super.move(e.getDirection());
		return ans;
	}
}
