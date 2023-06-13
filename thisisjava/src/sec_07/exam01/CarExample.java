package sec_07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.run2();
		myCar.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("매개변수 익명자식객체타이어 굴러갑니다.");
			}
		});
	}

}
