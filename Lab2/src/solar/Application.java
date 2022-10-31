package solar;
import java.util.ArrayList;

public class Application {
	private static ArrayList<Planet> planets;
	
	public static String printPlanet(Planet planet){
		Class a = planet.getClass();
		if(a.equals(Earth.class)) {
			Earth ref = (Earth) planet;
			String ans = "Earth's Waste Level is ";
			return ans + ref.getWasteLevel();
		}
		else if (a.equals(Saturn.class)) {
			Saturn ref = (Saturn) planet;
			String ans = "Saturn's Speed is ";
			return ans + ref.getSpeed();
		}
		return "";
	}
	public static void main() {
		Planet earth = new Earth(1,4);
		Planet saturn = new Saturn(2,2);
		planets.add(earth);
		planets.add(saturn);
		for(Planet x : planets) {
			System.out.println(printPlanet(x));
		}
	}
}
