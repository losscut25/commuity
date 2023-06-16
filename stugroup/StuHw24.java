package stugroup;

public class StuHw24 {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
		
	}
	void select() {
		listener.onSelect();
	}
	static interface OnSelectListener {
		void onSelect();
	}
}
