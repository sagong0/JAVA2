package sec_07.exam02;

public class Home {
	//FIeld
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("필드 익명구현객체가 켜집니다.");
		}

		@Override
		public void turnOff() {
			 System.out.println("필드 익명구현 객체가 꺼집니다.");
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
					System.out.println("로컬변수 익명구현객체가 켜집니다.");
				}
				@Override
				public void turnOff() {
					System.out.println("로컬변수 익명구현객체가 꺼집니다.");
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
