package board;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import common.PageInfo;


public class BoardService {
	
	public int selectListCount() {
		Connection conn = getConnection();
		
		int listCount = new BoardDao().selectListCount(conn);
		close(conn);
		
		return listCount;
	}
	
	public ArrayList<Board> selectList(PageInfo pi) {
		Connection conn = getConnection();
		
		ArrayList<Board> list = new BoardDao().selectList(conn, pi);
		close(conn);
		
		return list;
	}
	
	public int createBoard(String memId, String title, String content, String postType) {
		Connection conn = getConnection();
        
        // DAO를 통해 DB에 게시글 생성 요청
        int isCreate = 0;
        isCreate = new BoardDao().createBoard(conn, memId, title, content, postType);
        
        return isCreate;
    }
	
	public List<Board> getUserPosts(String memId) {
        return new BoardDao().getPostsByMemberId(memId);
    }
	
	public Board increaseCount(int boardNo) {
		Connection conn = getConnection();
		
		BoardDao bDao = new BoardDao();
		int result = bDao.increaseCount(conn, boardNo);
		
		Board b = null;
		if(result > 0) {
			commit(conn);
			b = bDao.selectBoard(conn, boardNo);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return b;
	}
	
	public int insertBoard(Board b, BoardFile bf) {
		Connection conn = getConnection();
		BoardDao bDao = new BoardDao();
		
		int result1 = bDao.insertBoard(conn, b);
		int result2 = 1;
		
		if(bf != null) {
			result2 = bDao.insertBoardFile(conn, bf);
		}
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result1 *  result2;
	}
}
