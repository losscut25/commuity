package stugroup;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StuHw28 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        
//        // 날짜 및 시간 정보 설정
//        calendar.set(Calendar.YEAR, 2024);
//        calendar.set(Calendar.MONTH, Calendar.MAY);  // 월은 0부터 시작하므로 4로 설정 (5월)
//        calendar.set(Calendar.DAY_OF_MONTH, 8);
//        calendar.set(Calendar.HOUR_OF_DAY, 10);
//        calendar.set(Calendar.MINUTE, 30);
//        
//        // 요일 정보 가져오기
//        int cal = calendar.get(Calendar.DAY_OF_WEEK);
//        //배열의 인덱스는 0부터 시작하므로, 요일을 배열에서 가져오기 위해선 1을 뺀 값이 인덱스가 되어야 합니다.
//        String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
//        String day = week[cal - 1];
//        
//        // 출력 형식을 지정할 SimpleDateFormat 객체 생성
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 " + day + " HH시 mm분");
//        
//        // 형식에 맞게 날짜를 문자열로 변환
//        String date = sdf.format(calendar.getTime());
//        
//        System.out.println(date);
//    }
//}
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) +1; // 월은 0부터 시작
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		
		int day2 = calendar.get(Calendar.DAY_OF_WEEK);
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String daya = week[day2-1];
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 " + day + " HH시 mm분");
		String date = sdf.format(calendar.getTime());
		
		System.out.println(date);
	}
}
