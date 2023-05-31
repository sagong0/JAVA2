package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
//		parent.method3();
//		parent.field2;
		
		Child child = (Child)parent;
		child.method3();
		child.field2 = "zz";
	}

}
