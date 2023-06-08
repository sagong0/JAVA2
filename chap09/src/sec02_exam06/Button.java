package sec02_exam06;

public class Button {
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.call();
	};

	static interface OnClickListener{
		void call();
	}
}
