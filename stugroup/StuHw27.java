package stugroup;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuHw27 {
    public static void main(String[] args) {
        // 출력할 날짜를 직접 설정
        int year = 2024;
        int month = 5;
        int day = 8;
        int hour = 10;
        int minute = 30;
        
        // 출력 형식을 지정할 SimpleDateFormat 객체 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        
        // 날짜 정보를 가지는 Date 객체 생성
        Date date = new Date(year - 1900, month - 1, day, hour, minute);
        
        // 형식에 맞게 날짜를 문자열로 변환
        String formattedDate = sdf.format(date);
        
        // 결과 출력
        System.out.println(formattedDate);
    }
}