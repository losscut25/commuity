package stugroup;

public class Student2 {
	public int studentNum;
	public String name;
	
	public Student2(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(!(obj instanceof Student2)) return false;   // 동일한 클래스(Student2)의 객체임에도 불구하고 false를 반환하고 있습니다.
		if(obj instanceof Student2) return true;   // 동일한 클래스(Student2)의 객체임에도 불구하고 false를 반환하고 있습니다.
		Student2 student = (Student2) obj;
		if(studentNum != student.studentNum) return false;
		return true; //현재 객체의 학생 번호(studentNum)와 비교 대상 객체의 학생 번호(student.studentNum)가 다른 경우에는 두 객체가 서로 다른 객체로 판단하고 false를 반환합니다.
//		현재 객체의 학생 번호(studentNum)와 비교 대상 객체의 학생 번호(student.studentNum)가 같은 경우에는 두 객체가 동일한 객체로 판단하고 true를 반환합니다.
	}
}
//Student2 클래스에서는 학번을 기준으로 동등성을 판단하기 위해 hashCode()와 equals() 메서드를 재정의합니다.