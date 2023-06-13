package super01;

public class Phone {
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		
		System.out.println("부모 Phone() 생성자 호출");
	}
}
