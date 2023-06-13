package sec_07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		Home home = new Home();
		home.method1();
		home.method2();
		
		home.method3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("매게변수 익명구현객체가 켜집니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("매게변수 익명구현객체가 꺼집니다.");
			}
		});
	}

}
