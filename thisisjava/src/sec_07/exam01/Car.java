package sec_07.exam01;

public class Car {
	Tire tire1 = new Tire();
	// 필드에 익명자식객체 대입
	Tire tire2 = new Tire() {
	@Override
	public void roll() {
		System.out.println("익명자식객체 타이어가 굴러갑니다.");
	}};
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// 로컬 변수에 익명자식객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("로컬변수 재정의 익명자식객체 타이어가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
