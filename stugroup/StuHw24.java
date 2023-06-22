package stugroup;
//중첩 인터페이스(OnSelectListener) 타입으로 필드(listener)를 선언하고 Setter메소드(setOnSelectListener())로 외부에서 구현 객체를 받아 필드에 대입한다.
//선택 이벤트가 발생했을 때(select() 메소드가 실행되었을 때) 인터페이스를 통해 구현 객체의 메소드를 호출(listener.onSelect())한다.
//다음 과 같은 결과가 출력되도록 구현 객체를 작성해보세요.
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
