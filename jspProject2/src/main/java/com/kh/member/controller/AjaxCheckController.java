package com.kh.member.controller;

import java.io.IOException;

import com.kh.member.service.MemberService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AjaxCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjaxCheckController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String checkId = request.getParameter("checkId");
		int count = new MemberService().idCheck(checkId);
		
		if(count > 0) {
			response.getWriter().print("NNNNN");
		} else {
			response.getWriter().print("NNNNY");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
