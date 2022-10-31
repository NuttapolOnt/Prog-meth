package card.base;


import player.Player;

//You CAN modify the first line
public abstract class CharacterCard extends Card {
	
	protected int lifePoint;
	protected int attackPoint;
	protected int defensePoint;
	
	public abstract int sacrifice(Player player);
	
	public CharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint) {
		super(name,description);
		this.lifePoint = lifePoint;
		this.attackPoint = attackPoint;
		this.defensePoint = defensePoint;

	}
	
	public void switchCharacter(Player player){
		/*
		 Hint:
			Use setNewCharacterLifePoint(int)
			, setAttack(int)
			, setDefense (int)
			, setAssignedCharacter (CharacterCard)
			from Player class
		 */
		player.setAssignedCharacter(this);
		player.setNewCharacterLifePoint(this.lifePoint);
		player.setAttack(this.attackPoint);
		player.setDefense(this.defensePoint);
		player.removeAllInventory();
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " \t [Char][HP : " + this.lifePoint + " ATK : " + this.attackPoint + " DEF : " + this.defensePoint + "]";
	}
}
