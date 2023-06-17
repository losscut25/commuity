package hw;
// 홀짝에 따라 다른 값 반환하기
public class Cdtest1 {
	   public int solution(int n) {
	       int answer = 0;
	        int sum = 0;
	        
	        if (n % 2 == 1) {
	            for (int i = 1; i <= n; i += 2) {
	                sum += i;
	            }
	            answer = sum;
	        } else {
	            for (int i = 2; i <= n; i += 2) {
	                answer += i * i;
	            }
	        }       
	        return answer;
	    }
	}






