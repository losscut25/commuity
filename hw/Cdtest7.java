package hw;
//정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
//입출력 예 #1
//[3, 4, 5, 2, 1]	393
//[5, 7, 8, 3]	581
//홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.
//입출력 예 #2
//홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.

public class Cdtest7 {
	    public int solution(int[] num_list) {
	         StringBuilder sum2 = new StringBuilder();
	        StringBuilder sum = new StringBuilder();

	        for (int i=0; i<num_list.length; i++) {
	            if(num_list[i] % 2 == 0) {
	                sum.append(num_list[i]);
	            } else {
	                sum2.append(num_list[i]);
	            }
	        }
	        int plus = Integer.parseInt(sum2.toString());
	        int plus2 = Integer.parseInt(sum.toString());
	        return plus + plus2;
	    }
	    public static void main(String[] args) {
	    	Cdtest7 sol = new Cdtest7();
	    	int [] arr = {3, 4, 5, 2, 1};
	    	System.out.println(sol.solution(arr));
	    }
	}