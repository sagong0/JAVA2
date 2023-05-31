package sec02.exam05;

public class Child extends Parent{
	public String field2;

	@Override
	public void method1() {
		System.out.println("Child method 1 ");
	}

	@Override
	public void method2() {
		System.out.println("Child method 2 ");
	}
	
	public void method3() {
		System.out.println("child method 3");
	}
	
}
