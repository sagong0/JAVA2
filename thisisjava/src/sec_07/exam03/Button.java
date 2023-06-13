package sec_07.exam03;

public class Button {
	private OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void click() {
		listener.onClick();
	}
	
	public static interface OnClickListener{
		public void onClick();
	}
}
