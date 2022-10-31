package card.cards;

import card.base.CharacterCard;
import player.Player;

//You CAN modify the first line
public class MainCharacterCard extends CharacterCard{
	
	private float levelUpBonus;
	private int Level;
	
	
	public MainCharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint,float levelUpBonus) {
		super(name, description, lifePoint, attackPoint, defensePoint);
		this.levelUpBonus = levelUpBonus;
		this.Level = 0;
	}
	
	public int sacrifice(Player player) {
		int healP = player.getMaxLifePoint() / 8;
		player.healPlayer(healP);
		return healP;
	}
	
	
	public  float levelUp(Player player) {
		player.setAttack((int) (player.getAttack() * (1 + levelUpBonus)));
		player.setDefense((int) (player.getDefense() * (1 + levelUpBonus)));
		player.setNewCharacterLifePoint((int) (player.getMaxLifePoint() * (1 + levelUpBonus)));
		Level++;
		return levelUpBonus;
	};
	
	public int getLevel() {
		return Level;
	}
	
	public void setLevel(int level) {
		this.Level = level;
	}
	@Override
	public String getName() {
		return super.getName() + " [level " + this.getLevel() + "]";
	}


	
}
