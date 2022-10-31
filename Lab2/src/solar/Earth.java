package solar;

public class Earth extends Planet{
	
	private int wasteLevel;
	
	public Earth() {
		super();
		this.wasteLevel = 0;
	}
	
	public Earth(int orbitRadius, int wasteLevel) {
		super(orbitRadius);
		if(wasteLevel < 0) {
			this.wasteLevel = 0;
		}
		else {
			this.wasteLevel = wasteLevel;
		}
	}
	
	public int getWasteLevel() {
		return this.wasteLevel;
	}
	public boolean orbit() {
		if((super.orbit()) && (wasteLevel <= 5)) {
			int x = coordinate.getX();
			int y = coordinate.getY();
			coordinate.setX(y);
			coordinate.setY(-x);
			return true;
		}
		return false;
	}
	
}
