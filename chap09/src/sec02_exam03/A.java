package sec02_exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}

	// ��� Ŭ������ ��ü �������� ����� �� �ִ� �������� ����Ǹ� ��ü�� �����ؼ� ����ؾ� �ϴ� �ٱ� Ŭ������ �ʵ�� �޼ҵ�� ����� �� ����.
	// �Ǵ�, ���� ���� Ŭ�����ȿ� �޼ҵ� (1��)������ �ٱ� Ŭ������ �ν��Ͻ� �ʵ��� �޼ҵ�(������) �ȿ��� ���� �ٲٴ� ���� �����Ϸ���
	// ���� ¦�� �¾ƾ��ϴµ�...
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();			
		}
	}
}