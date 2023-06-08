package sec02_exam01;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	// instance member class(non-static)
	public class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		// static int field2;
		void method1() {}
//		static void method1() {}
	}
	
	
//	정적 멤버 클래스
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2(){}
	}
	
	void method() {
		// Local Class (어차피 외부에서 쓸일X => 접근제한자,static 사용불가)
		class D{
			D(){System.out.println("D 객체가 생성됨");}
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


