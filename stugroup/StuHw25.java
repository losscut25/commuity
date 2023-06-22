package stugroup;

// object의 equals()와 hashCode()를 재정의해서 StuHw25의 학번(studentNum)
// 이 같으면 동등 객체가 될 수 있도록 해보세요. hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리턴하도록 하세요
public class StuHw25 {
	private String studentNum;
	
	public StuHw25(String studentNum) {
		this.studentNum=studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StuHw25) {
			StuHw25 student = (StuHw25) obj;
			
//obj 매개변수의 실제 타입이 StuHw25 클래스의 인스턴스인지 확인하기 위해서입니다.
//equals() 메서드는 Object 타입을 매개변수로 받으므로, 
//실제로 어떤 타입의 객체가 전달될지 알 수 없습니다.
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
//equals() 메서드와 hashCode() 메서드는 
//	자바의 객체 동등성 비교와 해시 기반 컬렉션에서 사용되는 메서드입니다.	

}
