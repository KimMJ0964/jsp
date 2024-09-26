package com.kh.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.kh.board.model.vo.Reply;
import com.kh.board.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AjaxReplyListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxReplyListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		ArrayList<Reply> list = new BoardService().selectReplyList(boardNo);
		
//		response.setContentType("text/html; charset=utf-8");
		response.setContentType("application/json; charset=utf-8");
		new Gson().toJson(list, response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
