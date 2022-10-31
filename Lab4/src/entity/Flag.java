package entity;

import entity.base.*;
import logic.GameController;
import logic.Sprites;

public class Flag extends Entity implements Interactable{
	
	public int getSymbol() {
		return Sprites.FLAG;
	}
	
	public boolean interact(Entity e) {
		if(e instanceof Player) {
			e.remove();
			GameController.setGameWin(true);
			return true;
		}
		return false;
	}
	
}
