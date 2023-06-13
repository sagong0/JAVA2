package airplane;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = sa.SUPERSONIC;
		sa.fly();
	}

}
