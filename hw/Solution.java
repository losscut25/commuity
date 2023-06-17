package hw;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        
        // s 이전까지의 문자열을 answer에 추가
        answer.append(my_string.substring(0, s));
        
        // overwrite_string을 answer에 추가
        answer.append(overwrite_string);
        
        // s + overwrite_string의 길이 이후의 문자열을 answer에 추가
        answer.append(my_string.substring(s + overwrite_string.length()));
        
        return answer.toString();
    }
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        
        Solution solution = new Solution();
        String result = solution.solution(my_string, overwrite_string, s);
        
        System.out.println(result);
    }
}
