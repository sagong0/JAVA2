package sec04.exam02;

public class Child extends Parent{
	private String name;
	
	public Child() {
//		��� Parent ������ ����������
		// super()
		this("ȫ�浿");
		System.out.println("CHild() call");
	}
	
	public Child(String name) {
//		super����
		this.name = name;
		System.out.println("Child(String name) call");
	}
}