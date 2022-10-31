package deck;


import java.util.Arrays;

import card.base.Card;


public class Deck {
	// TODO: constructor
	
	private String Name;
	private int deckSize;
	private Card[] deckList;

	public Deck(String name, Card[] deckList) {
		this.Name = name;
		setDeckSize(deckList.length);
		this.deckList = deckList;
	}



	//You CAN modify the first line
	public int insertCard(Card card) throws InsertCardFailedException{
		int count = 0;
		for(int i = 0; i < deckSize; i++) {
			if(card.equals(deckList[i])) {
				count += 1;
			}
		}
		if(count >= 4) 
			throw new InsertCardFailedException("You can only put 4 of the same cards into the deck");
		//FILL CODE HERE
		//You can use Arrays.copyOf(Original Array, New Length) to create new arrays with bigger size
		//Must return new deckSize
		else {
			deckList = Arrays.copyOf(deckList, deckSize+1);
			deckSize += 1;
			deckList[deckSize-1] = card;
		}
		return deckSize;
	}

	//You CAN modify the first line
	public Card removeCard(int slotNumber) throws RemoveCardFailedException {
		if (this.deckList.length <= slotNumber) {
			throw new RemoveCardFailedException("Number you insert exceed deck size");
		}		
		if (this.deckList[slotNumber] == null) {
			throw new RemoveCardFailedException("There is no card in that slot");
		}
		//FILL CODE HERE
		//You can use Arrays.copyOf(Original Array, New Length) to create new arrays with bigger size
		//Once card is removed, other card down the list must rearrange to the empty slot
		//Must return card that was removed
		Card removed = deckList[slotNumber];
		int count = 0;
		for(int i = 0; i < deckSize-1; i++) {
			if(i == slotNumber) {
				count += 1;
			}
			deckList[i] = deckList[i+count];
		}
		deckList = Arrays.copyOf(deckList, deckSize - 1);
		deckSize -= 1;
		return removed;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{").append(this.getName()).append("}")
				.append("(").append(this.getDeckSize()).append(" deck size)")
				.toString();
	}

	/* GETTERS & SETTERS */

	public String getName() {
		return Name;
	}

	public int getDeckSize() {
		return deckSize;
	}



	public void setDeckSize(int deckSize) {
		this.deckSize = deckSize;
	}



	public Card[] getDeckList() {
		return deckList;
	}

	
	

	
}
