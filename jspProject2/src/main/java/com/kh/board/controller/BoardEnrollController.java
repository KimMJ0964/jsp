package com.kh.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.kh.board.model.vo.Category;
import com.kh.board.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardEnrollController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardEnrollController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 카테고리 목록 가져와서 boardEnrollForm.jsp 포워딩
		
		ArrayList<Category> list = new BoardService().selectCategoryList();
		
		// 응답 뷰
		request.setAttribute("categorys", list);
		request.getRequestDispatcher("views/board/boardEnrollForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
