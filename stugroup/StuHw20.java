package stugroup;

public interface StuHw20 {
	String sound();
}
class Cat implements StuHw20 {

	public String sound() { 	
		return "야옹";
	}
	
}
class Dog implements StuHw20 {
	
	public String sound() { 	
		return "멍멍";
	}
	
}