package sec_07.exam01;

public class Car {
	Tire tire1 = new Tire();
	// �ʵ忡 �͸��ڽİ�ü ����
	Tire tire2 = new Tire() {
	@Override
	public void roll() {
		System.out.println("�͸��ڽİ�ü Ÿ�̾ �������ϴ�.");
	}};
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// ���� ������ �͸��ڽİ�ü ����
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("���ú��� ������ �͸��ڽİ�ü Ÿ�̾ �������ϴ�.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
