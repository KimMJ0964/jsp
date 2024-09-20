package com.kh.controller;

import java.io.IOException;

import com.kh.model.vo.Person;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ELServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 데이터를 담을 수 있는 JSP 내장 객체의 종류
		 * 
		 * 1. ServletContext(application scope)
		 * 		한 애플리케이션당 단 1개 존재하는 객체
		 * 		이 영역에 데이터를 담으면 애플리케이션 전역에서 사용이 가능
		 * 		공유범위가 가장 크다
		 * 
		 * 2. HttpSession(session scope)
		 * 		한 브라우저당 1개 존재하는 객체
		 * 		이 영역에 데이터를 담으면 jsp/servlet단에서 사용이 가능
		 * 
		 * 3. HttpServletRequest
		 * 		요청때마다 매번 생성되는 객체
		 * 		이 영역에 데이터를 담으면 해당 request 객체를 포워딩받는 응답 JSP에서만 사용 가능
		 * 
		 * 4. PageContext(page scope)
		 * 		JSP마다 존재하는 객체
		 * 		공유범위가 가장 작음(해당 페이지에서만 공유)
		 * 
		 * 위 4개의 객체들에
		 * 데이터를 담을 때 -> setAttribute('키', 값)
		 * 데이터를 꺼낼 때 -> getAttribite('키', 값)
		 * 데이터를 삭제할 떄 -> 
		 */
		
		// application scope
		ServletContext application = request.getServletContext();
		application.setAttribute("scope", application);
		
		// session scope
		HttpSession session = request.getSession();
		session.setAttribute("academy", "kh");
		session.setAttribute("teacher", new Person("김지원", 30, "여자"));
		session.setAttribute("scope", "session");
		
		// request scope
		request.setAttribute("classRoom", "I강의장");
		request.setAttribute("student", new Person("최지원", 20, "남자"));
		request.setAttribute("scope", "request");
		
		RequestDispatcher view = request.getRequestDispatcher("views/1_EL/01_el.jsp");
		
		// 선택한 뷰가 사용자에게 보여지도록 포워딩
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
