package entity;

import entity.base.*;
import logic.GameController;
import logic.Sprites;

public class Coin extends Entity implements Interactable{
	
	public int getSymbol() {
		return Sprites.COIN;
	}
	
	public boolean interact(Entity e) {
		super.remove();
		GameController.addCoinCount(1);
		return true;
	
	}
	

}
