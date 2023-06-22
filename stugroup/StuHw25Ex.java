package stugroup;

import java.util.HashMap;
//키-값 쌍 저장: HashMap은 키(Key)와 값(Value)의 쌍으로 데이터를 저장합니다. 
//각 키는 고유해야 하며, 키를 통해 해당 값을 검색할 수 있습니다.

public class StuHw25Ex {
	public static void main(String[] args) {
		//Student 키로 총점을 HashMap<K, V>hashMap 객체 생성
		HashMap<StuHw25, String> hashMap = new HashMap<StuHw25, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new StuHw25("1"), "95");
		
		//new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new StuHw25("1"));
		System.out.println("1번 학생의 총점: " + score);
	}

}
