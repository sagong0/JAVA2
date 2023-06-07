package sec01_exam06;

public class MyClass {
	// 필드의 다형성
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드 매개변수
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}