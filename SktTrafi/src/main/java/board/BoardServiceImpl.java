package board;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.PageInfo;
import common.Template;
import jakarta.servlet.http.HttpServletRequest;


public class BoardServiceImpl implements BoardService{
	private BoardDao bDao = new BoardDao();
	
	@Override
	public int selectListCount() {
		SqlSession sqlSession = Template.getSqlSession();
		int listCount = bDao.selectListCount(sqlSession);
		
		sqlSession.close();
		return listCount;
	}
	
	@Override
	public ArrayList<Board> selectList(PageInfo pi) {
		SqlSession sqlSession = Template.getSqlSession();
		ArrayList<Board> list = bDao.selectList(sqlSession, pi);
		
		sqlSession.close();
		
		return list;
	}
	
	@Override
	public Board increaseCount(int boardNo) {
		SqlSession sqlSession = Template.getSqlSession();
		int result = bDao.increaseCount(sqlSession, boardNo);
		
		Board b = null;
		if (result > 0) {
			sqlSession.commit();
			b = bDao.selectBoard(sqlSession, boardNo);
		} else {
			sqlSession.rollback();
		}
		
		return b;
	}
	
	@Override
	public ArrayList<Board> selectMyPageBoardList(String loginId) {
		SqlSession sqlSession = Template.getSqlSession();
		ArrayList<Board> list = bDao.selectMyPageBoardList(sqlSession, loginId);
		
		sqlSession.close();
		
		return list;
		
	}
	
	@Override
	public int insertBoard(Board b, BoardFile bf) {
		SqlSession sqlSession = Template.getSqlSession();
		
		int result1 = bDao.insertBoard(sqlSession, b);
		int result2 = 1;
		
		if(bf != null) {
			result2 = bDao.insertBoardFile(sqlSession, bf);
		}
		
		if(result1 > 0 && result2 > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		return result1 *  result2;
	}
	// ----------------- 마이바티스 이전 ------------------------
	
	
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
	
	
	public int deleteBoard(HttpServletRequest request, int boardNo) {
		Connection conn = getConnection();
		BoardDao bDao = new BoardDao();
		
		int result = bDao.deleteBoard(conn, boardNo);
		String[] result3 = bDao.deleteBoardFileTwo(conn, boardNo);
		int result2 = bDao.deleteBoardFile(conn, boardNo);
		
		String changeName = result3[0]; // 변경된 파일명
        String filePath = result3[1];   // 파일 경로
         
        String savePath = request.getServletContext().getRealPath("/" + filePath);
        
        System.out.println(savePath + changeName);
         // 서버에서 파일 삭제
        File file = new File(savePath + changeName);
		
		if(result > 0) {
			 if (file.exists()) {
                 if (file.delete()) {
                     System.out.println("파일 삭제 성공: " + savePath + changeName);
                 } else {
                     System.out.println("파일 삭제 실패: " + savePath + changeName);
                 }
             } else {
                 System.out.println("파일이 존재하지 않습니다: " + savePath + changeName);
             }
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
	
		return result;
	}
}
