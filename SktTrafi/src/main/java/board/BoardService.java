package board;

import java.util.ArrayList;

import common.PageInfo;

public interface BoardService {
	//게시판리스트 조회
		public int selectListCount();
		
		public ArrayList<Board> selectList(PageInfo pi);
		
		// 게시글 상세조회
		public Board increaseCount(int boardNo);
		
		public ArrayList<Board> selectMyPageBoardList(String loginId);
		
		public int insertBoard(Board b, BoardFile bf);
//		
//		public ArrayList<Reply> selectReplyList(int boardNo);
}
