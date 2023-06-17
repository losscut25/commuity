package hw;
// 조건 문자열
//입출력 예 #1
//
//20 <= 50은 참이기 때문에 1을 return합니다.
//입출력 예 #2
//
//41 > 78은 거짓이기 때문에 0을 return합니다.
public class Cdtest2 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(n<=m && ineq.equals( "<") && eq.equals("=")) {
            answer = 1;
        } else if(n>=m && ineq.equals( ">") && eq.equals("=")) {
            answer = 1;
        } else if(n<m && ineq.equals( "<") && eq.equals("!")){
            answer = 1;
        } else if(n>m && ineq.equals( ">") && eq.equals("!")) {
            answer = 1;
        } else {
            answer = 0;
        }
          return answer;
        }
    }