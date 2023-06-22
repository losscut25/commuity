package stugroup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import hw.Student;

public class StuHw31 {
	public static void main(String[] args) {
		Set<Student2> set = new HashSet<Student2>();
		
		set.add(new Student2(1, "홍길동"));
		set.add(new Student2(2, "신용권"));
		set.add(new Student2(1, "조민우"));
		
		Iterator<Student2> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student2 student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}

//Set 인터페이스를 구현한 HashSet 컬렉션을 사용하여 학생 객체를 저장합니다. 
//Set은 중복을 허용하지 않는 컬렉션으로, 동일한 학번을 가진 학생 객체는 중복으로 취급되지 않습니다.
//Iterator를 사용하여 저장된 학생 정보를 출력합니다. Iterator를 통해 HashSet의 요소를 순회하면서 각 학생 객체의 학번과 이름을 출력합니다.
//hasNext(): 다음 요소가 있으면 true를 반환하고, 더 이상 요소가 없으면 false를 반환합니다.
//next()로 다음 요소에 접근합니다. 반복문이 순회를 종료하면 순회 과정이 완료됩니다.
