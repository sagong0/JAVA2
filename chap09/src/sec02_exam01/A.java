package sec02_exam01;

public class A {
	A(){System.out.println("A ��ü�� ������");}
	
	// instance member class(non-static)
	public class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		// static int field2;
		void method1() {}
//		static void method1() {}
	}
	
	
//	���� ��� Ŭ����
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2(){}
	}
	
	void method() {
		// Local Class (������ �ܺο��� ����X => ����������,static ���Ұ�)
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}


