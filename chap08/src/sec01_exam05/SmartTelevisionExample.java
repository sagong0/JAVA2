package sec01_exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
//		rc.searchable();
//		System.out.println(tv instanceof SmartTelevision);
		
		Searchable searchable = tv;
		searchable.search("http://www.hschool.co.kr");
//		System.out.println(tv instanceof Searchable);
	}
}