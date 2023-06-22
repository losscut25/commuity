package stugroup;

import java.io.BufferedReader;
import java.io.FileReader;

public class StuHw32 {
	public static void main(String[] args) throws Exception {
		String filePath = "src/stugroup/StuHw32.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while((rowData=br.readLine())!=null) {
			System.out.println(++rowNumber + ":" + rowData);
		}
		br.close();
	}
}
//BufferedReader br = new BufferedReader(fr): FileReader로부터 읽은 내용을 버퍼링하기 위해 BufferedReader 객체를 생성합니다. 생성자의 인자로는 FileReader 객체(fr)를 전달합니다.
//
//int rowNumber = 0: 행 번호를 나타내기 위한 변수를 초기화합니다.
//
//String rowData: 파일에서 읽은 한 줄의 데이터를 저장할 변수입니다.
//while ((rowData = br.readLine()) != null): 파일에서 한 줄씩 데이터를 읽어옵니다. readLine 메서드는 파일에서 한 줄을 읽고 
//그 내용을 rowData에 할당합니다. 파일의 끝에 도달하면 null을 반환하므로, null이 아닐 때까지 반복합니다.
//System.out.println(++rowNumber + ":" + rowData): 행 번호와 읽은 데이터를 출력합니다. ++rowNumber를 통해 행 번호를 증가시키고, rowData와 함께 출력합니다.
//
//br.close(): 파일 읽기가 끝난 후에는 BufferedReader를 닫습니다.