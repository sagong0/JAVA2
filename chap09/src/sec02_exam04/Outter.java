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
	
	// �޼ҵ� ������ ����Ǹ� �������� ���� �Ϲ���������, �޼ҵ尡 ����Ǿ ��� ���� ���·� ������ �� �ִ�.
	
	public void method2(int arg) {
		// �޼ҵ��� �Ű������� ���ú����� ���� Ŭ�������� ����Ҷ��� ������ ����.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int localVariable = 1;
//		arg = 100; (X) �޼ҵ忡�� ���� �Ķ���� �Ǵ� �ʵ�>> final�� �����ϰ��ֱ⶧�� (JAVA 8�����̻� ��������)
//		localVariable = 100; (x)
		class Inner {
			public void method() { 
				int result = arg + localVariable;
			}
		}
	}
	
	
}