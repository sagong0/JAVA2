package sec_07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		Home home = new Home();
		home.method1();
		home.method2();
		
		home.method3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("�ŰԺ��� �͸�����ü�� �����ϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("�ŰԺ��� �͸�����ü�� �����ϴ�.");
			}
		});
	}

}
