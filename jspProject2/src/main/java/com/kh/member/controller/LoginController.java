package com.kh.member.controller;

import java.io.IOException;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) 전달값에 한글이 있을 경우, 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		
		// 2) 요청시 전달 값 추출해서 변수 또는 객체에 기록하기
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Member loginUser = new MemberService().loginMember(userId, userPwd);
		
		if(loginUser == null) {
			// 조회결과 없음 -> 로그인 실패 -> 에러 문구가 보여지는 에러페이지로 포워딩
			request.setAttribute("errorMsg", "로그인에 실패하였습니다.");
			
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		} else {
			// 조회결과 있음 -> 로그인 성공
			// 로그인된 회원정보를 session 영역에 담기(왜? 모든 페이지에서 다 가져다 사용할 수 있도록)
			// Servlet에서는 session 영역에 접근하고자 한다면 우선 세션객체를 얻어야한다.
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			
			// 1. 포워딩 방식 -> 해당 방식은 url이 변경되지 않는다. 
			// -> 우리는 localhost:5000/jsp/라는 기존의 메인 url이 있다.
			// 	그런데 해당 방식으로 응답시, url은 http://localhost:5000/jsp/login.me가 나타낸다.
			//  실제 화면은 localhost:5000/jsp의 응답 화면이 나타난다.
			// request.getRequestDispatcher("index.jsp").forward(request, response);
			
			// 2. url 재요청 방식
			// 기존에 해당 페이지를 응답하는 url이 존재했다면 사용가능
			// 응답 페이지 -> index.jsp 페이지(jsp url 재요청)
			response.sendRedirect(request.getContextPath());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
