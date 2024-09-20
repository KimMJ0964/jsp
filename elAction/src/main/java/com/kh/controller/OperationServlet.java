package com.kh.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.kh.model.vo.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OperationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("big", 10);
		request.setAttribute("small", 3);
		
		request.setAttribute("sOne", "");
		request.setAttribute("sTwo", "");
		request.setAttribute("sThree", "");
		
		request.setAttribute("pOne", new Person("", 20, ""));
		request.setAttribute("pTwo", null);
		
		ArrayList<String> list1 = new ArrayList<>();
		request.setAttribute("aOne", list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("오늘 점심은 뭐먹을까요?");
		request.setAttribute("aTwo", list2);
		
		request.getRequestDispatcher("views/1_EL/02_operation.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
