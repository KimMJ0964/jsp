package com.kh.board.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.board.model.vo.Board;
import com.kh.board.service.BoardService;

public class ThumbnailListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThumbnailListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Board> list = new BoardService().selectThumbnailList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("views/board/thumbnailListview.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
