package hw;
//정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

//num_list	result
//[2, 1, 6]	[2, 1, 6, 5]
//[5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]

//입출력 예 #1
//마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
//입출력 예 #2
//마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
public class Cdtest8 {
	    public int[] solution(int[] num_list) {
//	        int[] answer;
//	        int length = num_list.length;
//	        int le = num_list[length - 1];
//	        int pe = num_list[length - 2];
//	        
//	        if(le>pe) {
//	            int diff = le - pe;
//	            answer = new int[length+1];
//	            System.arraycopy(num_list, 0, answer, 0, length);
//	            answer[length] = diff;
//	        } else {
//	            int de = le * 2;
//	            answer = new int[length + 1];
//	            System.arraycopy(num_list, 0, answer, 0, length);
//	            answer[length] = de;
//	        }
//	          return answer;
//	        }  

	    	int[] answer = new int[num_list.length+1];
	    	int length = num_list.length;
	    	int de = num_list.length-1;
	    	int le = num_list.length-2;
	    	for(int i =0; i<num_list.length; i++) {
	    		answer[i] = num_list[i];
	    	}
	    	if(num_list[de] > num_list[le]) {
	    		answer[de +1] = num_list[de] - num_list[le];
	    	}else {
	    		answer[de +1] = num_list[de]*2;
	    	}
	    	return answer;
	    }
    	
}