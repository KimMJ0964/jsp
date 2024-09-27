package board;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class BoardDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardDetailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		BoardService bService = new BoardServiceImpl();
		//조회수 증가 + 상세조회
		Board b = bService.increaseCount(boardNo);
		
		if(b != null) {
			request.setAttribute("b", b);
			request.getRequestDispatcher("views/board/boardView.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMsg", "상세조회 실패");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
