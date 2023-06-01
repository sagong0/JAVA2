package sec04.exam02;

public class Child extends Parent{
	private String name;
	
	public Child() {
//		요기 Parent 생성자 숨어잇응ㅁ
		// super()
		this("홍길동");
		System.out.println("CHild() call");
	}
	
	public Child(String name) {
//		super없음
		this.name = name;
		System.out.println("Child(String name) call");
	}
}