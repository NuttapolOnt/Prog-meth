package solar;

public class Saturn extends Planet{
	
	private int speed;
	
	public Saturn(){
		super();
		this.speed = 0;
	}
	
	public Saturn(int orbitRadius, int speed) {
		super(orbitRadius);
		if (speed < 0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return this.speed; 
	}
	
	public boolean orbit() {
		if((super.orbit()) && (speed > 0)) {
			for(int i = 0; i < speed; i++) {
				int x = coordinate.getX();
				int y = coordinate.getY();
				coordinate.setX(y);
				coordinate.setY(-x);
			}
			return true;
		}
		return false;
	}
}
