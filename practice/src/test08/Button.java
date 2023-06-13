package test08;

public class Button {
	
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	};
	
	public static interface OnClickListener{
		void onClick();
	}
}
