package solar;

public class Planet {
	protected Coordinate coordinate;
	protected Coordinate orbitCenterCoordinate;
	protected int orbitRadius;
	
	public Planet() {
		coordinate = new Coordinate(1,0);
		orbitCenterCoordinate = new Coordinate();
		orbitRadius = 1;
	}
	
	public Planet(int orbitRadius) {
		if(orbitRadius < 1) {
			this.orbitRadius = 1;
		}
		else {
			this.orbitRadius = orbitRadius;
		}
		coordinate = new Coordinate(this.orbitRadius,0);
		orbitCenterCoordinate = new Coordinate();
		
	}

	public Coordinate getCoordinate() {
		return this.coordinate;
	}

	public Coordinate getOrbitCenterCoordinate() {
		return orbitCenterCoordinate;
	}
	
	public int getOrbitRadius() {
		return this.orbitRadius;
	}
	
	public boolean orbit() {
		int posx = coordinate.getX();
		int posy = coordinate.getY();
		if(posx == orbitCenterCoordinate.getX()) {
			if((posy == orbitCenterCoordinate.getY()+orbitRadius) || (posy == orbitCenterCoordinate.getY() - orbitRadius )) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(posy == orbitCenterCoordinate.getY()) {
			if((posx == orbitCenterCoordinate.getX()+orbitRadius) || (posx == orbitCenterCoordinate.getX() - orbitRadius )) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
