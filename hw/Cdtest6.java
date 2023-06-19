package hw;
//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
public class Cdtest6 {
	    public int solution(int[] num_list) {
	        int mul = 1;
	        int sum = 0;
	        
	        for (int i = 0; i < num_list.length; i++) {
	            mul *= num_list[i];
	            sum += num_list[i];
	        }
	        
	        int answer;
	        if (mul < sum*sum) {
	            answer = 1;
	        } else {
	            answer = 0;
	        }
	       
	        return answer;
	    }
	}
