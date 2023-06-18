package hw;

public class Cdtest3 {
	  public String solution(String code) {
		  String answer = "";
		  int mode = 0;
		  for(int idx = 0; idx<code.length(); idx++) {
			  if(mode == 0) {
				  if(code.charAt(idx) != '1') {
					  if(idx%2==0) {
						  answer += code.charAt(idx);
					  }
				  } else {
					  mode = 1;
				  }
			  }else if(mode == 1) {
				  if(code.charAt(idx) != '1') {
					  if(idx%2!=0) {
						  answer += code.charAt(idx);
					  }
				  }else {
					  mode=0;
				  }
			  }
		  }
		  if (answer.equals("")) {
	            answer = "EMPTY";
	        }
	        return answer;
	    }
	  public static void main(String[] args) {
		  Cdtest3 sol = new Cdtest3(); 
		  String a = "abc1abc1abc";
		  String result = sol.solution(a);
		  System.out.println(result);
	  }
	}
