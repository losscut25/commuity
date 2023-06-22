package stugroup;

import java.util.List;

public class StuHw30 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}

// list 목록의 board 값 가져오기. BoardDao에서 board 값 넣고, 넣은 값 가져오기 이때 new board생성자 값을 불러와서 두 값을 모두 출력할 수 있도록 정의