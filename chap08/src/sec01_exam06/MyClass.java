package sec01_exam06;

public class MyClass {
	// �ʵ��� ������
	RemoteControl rc = new Television();
	
	// ������
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
	
	//�޼ҵ� �Ű�����
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}