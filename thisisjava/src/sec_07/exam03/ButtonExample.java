package sec_07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		Button myBtn = new Button();
		
		myBtn.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�͸�����ü�� Ŭ�� !");
			}
		});
		myBtn.click();
	}

}
