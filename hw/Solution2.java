package hw;

public class Solution2 {
	public int solution(int a, int b) {
        String sum = String.valueOf(a) + String.valueOf(b);
        int sum1 = Integer.parseInt(sum);
        int multi = (2*a)*b;
        if(sum1 >= multi) {
        	return sum1;
        }else {
        	return multi;
        }
    }
	public static void main(String[] args) {
		int a = 2;
		int b = 91;
		
		 Solution2 solution = new Solution2();
		 int result = solution.solution(a, b);
		System.out.println(result);
	}
}