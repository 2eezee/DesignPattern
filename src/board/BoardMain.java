package board;

import board.bean.Board;
import board.dao.BoardDao;
import board.service.BoardService;

public class BoardMain extends BoardTemplate {
	
	static BoardService boardService = BoardDao.getInstance();
			
	public static void main(String[] args) {
		
		// List<Board> boardList = boardService.getBoardList(); 
		
		BoardTemplate bt = new BoardMain();
		bt.printList();
		
		boardService.deleteBoard(2);
		
		Board board4 = new Board(4, "제목 4", "내용 4");
		boardService.registBoard(board4);
		
		board4.setTitle("새  제목 4");
		board4.setContent("새 내용 4");
		boardService.updateBoard(board4);
		
	}
	@Override
	public void printMiddle() {
		// 람다식 
		boardService.getBoardList().forEach(bl -> {
			System.out.println("제목 : " + bl.getTitle());
			System.out.println("내용 : " + bl.getContent());
		}); 
		
	}
	
	@Override
	public void printBottom() {
		System.out.println("##끝");
	}
	
	@Override
	public void printTop() {
		System.out.println("### 시작");
	}
	
	
	@Override
	public void printList() {
		printTop();
		printMiddle();
		printBottom();
		
	}
}
