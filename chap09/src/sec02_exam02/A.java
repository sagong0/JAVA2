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
	// static field �ʱ�ȭ
//	static B field3 = new B();
	static C field4 = new C();
	
	
	
	// static method
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}
	// �ٱ��� �����ʵ峪 ���� �޼ҵ忡���� ��ü ���� ���� ���ٰ��� but,���� instance��ü(���� ���빰)�� �׷��� �ʱ� ����
	// �Ǵ�, ��� Ŭ������ �ν��Ͻ��� ��ü ������ ���� �����ε� �ٱ� �ʵ峪 �޼ҵ尡 static �̶�� ��ü ������ �ȵǾ� ���� �� �ֱ� ����
	class B{}
	static class C{}
}