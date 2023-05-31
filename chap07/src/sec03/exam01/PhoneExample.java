package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();  (X) phone은 추상 클래스라 자식 통해 생성해야함
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}