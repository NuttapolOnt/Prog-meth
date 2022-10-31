package card.base;

import java.util.Objects;

//You CAN modify the first line
public abstract class Card {
	
	protected String Name;
	protected String Description;
	
	public Card(String name, String description) {
		this.Name = name;
		this.Description = description;
	}
	
	public abstract String toString();
	
	public String getName() {
		return Name;
	}
	
	public String getDescription() {
		return Description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Description, Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(Description, other.Description) && Objects.equals(Name, other.Name);
	}
	
	
}
