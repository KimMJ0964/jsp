package com.kh.member.controller;

import java.io.IOException;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MemberPwdUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberPwdUpdateController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String updatePwd = request.getParameter("updatePwd");
		
		Member updateMember = new MemberService().updatePwdMember(userId, userPwd, updatePwd);
		
		if(updateMember == null) { //수정에 실패
			request.setAttribute("errorMsg", "비밀번호 수정에 실패하였습니다.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", updateMember);
			session.setAttribute("alertMsg", "성공적으로 수정하였습니다.");
			
			response.sendRedirect(request.getContextPath() + "/myPage.me");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}