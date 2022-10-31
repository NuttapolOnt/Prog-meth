package card.cards;

import player.Player;
import card.base.ItemCard;

//You CAN modify the first line
public class ExodiaPartCard extends ItemCard{
	
	
	public ExodiaPartCard(String name, int defense) {
		super(name, "Assemble 4 of Exodia part card to win the game", 0 , 0, defense);
	}
	
	public void equipItem(Player player) {
		int increase = defenseBonus;
		if(player.getAssignedCharacter() instanceof ExodiaCharacterCard) {
			increase *= 2;
		}
		player.addInventory(this);
		player.setDefense(player.getDefense() + increase);
	}
	


}