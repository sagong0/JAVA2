package sec01_exam06;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1) ---------------------------");
		
		// myClass에서 rc 처다봐 거기서 new Television으로 생성되있음(필드의 다형성)
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		
		System.out.println("2 ) ---------------------------");
		MyClass myClass2 = new MyClass(new Audio());
		// 생성자 RemoteControl rc  = new Audio();
		
		System.out.println("3 ) ---------------------------");
		MyClass myClass3  = new MyClass();
		myClass3.methodA();
		// 메소드의 로컬 변수 형식으로 ... 인터페이스 변수 사용
		
		System.out.println(" 4 ) ---------------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
		
	}

}