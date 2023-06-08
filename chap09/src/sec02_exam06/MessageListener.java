package sec02_exam06;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void call() {
		System.out.println("메세지를 보냅니다 ~ .");
	}
}