package sec_07.exam02;

public class Home {
	//FIeld
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("�ʵ� �͸�����ü�� �����ϴ�.");
		}

		@Override
		public void turnOff() {
			 System.out.println("�ʵ� �͸��� ��ü�� �����ϴ�.");
		}};
		
		// method
		public void method1() {
			rc.turnOn();
			rc.turnOff();
		}
		
		public void method2() {
			RemoteControl rc = new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("���ú��� �͸�����ü�� �����ϴ�.");
				}
				@Override
				public void turnOff() {
					System.out.println("���ú��� �͸�����ü�� �����ϴ�.");
				}
			};
			rc.turnOn();
			rc.turnOff();
		}
		
		public void method3(RemoteControl remoteControl) {
			remoteControl.turnOn();
			remoteControl.turnOff();
		}
}
