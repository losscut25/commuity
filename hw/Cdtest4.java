package hw;

public class Cdtest4 {
    public int solution(int a, int d, boolean[] included) {
int answer = 0;
for(int i=0; i<included.length; i++){
   if(included[i] == true) {
       answer += a+(i*d);
   }
}
return answer;
    }
}


//int answer = 0;
//for(int i=0; i<included.length; i++){
//    included[0] = a;
//    included[i] += b;
//    if(included[i] == true) {
//        
//    }
//}
//return answer;
//}
//}