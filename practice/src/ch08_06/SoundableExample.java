package ch08_06;

public class SoundableExample {
	
	
	public static void printSound(Soundable soundable) {
		soundable.sound();
	}
	
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
