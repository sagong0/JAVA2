package sec02_exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		// a class ���� b������ �� ��� a.new B()
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
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