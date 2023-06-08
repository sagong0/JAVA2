package sec02_exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100; (X)
//		localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 메소드 실행이 종료되면 없어지는 것이 일반적이지만, 메소드가 종료되어도 계속 실행 상태로 존재할 수 있다.
	
	public void method2(int arg) {
		// 메소드의 매개변수나 로컬변수를 로컬 클래스에서 사용할때만 제한이 있음.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int localVariable = 1;
//		arg = 100; (X) 메소드에서 받은 파라미터 또는 필드>> final이 상주하고있기때문 (JAVA 8버전이상 생략가능)
//		localVariable = 100; (x)
		class Inner {
			public void method() { 
				int result = arg + localVariable;
			}
		}
	}
	
	
}