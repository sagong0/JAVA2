package sec_07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.run2();
		myCar.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("�Ű����� �͸��ڽİ�üŸ�̾� �������ϴ�.");
			}
		});
	}

}
