package sec02_exam02;

public class A {
	// instance field
	B field1 = new B();
	C field2 = new C();
	
	// instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}	
	// static field 초기화
//	static B field3 = new B();
	static C field4 = new C();
	
	
	
	// static method
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}
	// 바깥쪽 정적필드나 정적 메소드에서는 객체 생성 없이 접근가능 but,안쪽 instance객체(실제 내용물)는 그렇지 않기 떄문
	// 또는, 멤버 클래스가 인스턴스면 객체 생성이 전제 조건인데 바깥 필드나 메소드가 static 이라면 객체 생성이 안되어 있을 수 있기 때문
	class B{}
	static class C{}
}