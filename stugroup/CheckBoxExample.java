package stugroup;

public class CheckBoxExample {
	
	public static void main(String[] args) {
		StuHw24 checkBox = new StuHw24();
		checkBox.setOnSelectListener(new StuHw24.OnSelectListener() {
				@Override
				public void onSelect() {
			System.out.println("배경을 변경합니다.");
			}
		});
		checkBox.select();
	}
}