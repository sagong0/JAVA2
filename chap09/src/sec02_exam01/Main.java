package sec02_exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		// a class 없이 b생성될 수 없어서 a.new B()
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		// static field2, method2()
		A.C.field2 = 3;
		A.C.method2();
		a.method();
	}
}