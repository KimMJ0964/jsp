package com.kh.common;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.kh.member.model.vo.Member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AjaxServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxServletController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("이름 : " + name + ", 나이 : " + age );
		
		// 여러 개를 한번에 반환하기 어렵다.
		// response.getWriter().print(name);
		// response.getWriter().print(age);
		
		/*
		 * JSON(자바스크립트에서 객체를 표현했던 방법, 실제로는 파일형식을 의미한다.)
		 * ajax 통신시, 데이터 전송에 가장 많이 사용되는 포맷형식 중 하나
		 * 
		 * JSONArray
		 * [value, value, value ...]
		 * 
		 * JSONObject
		 * { key : value, key : value...}
		 *
		 */
		
		/*
		JSONArray jArr = new JSONArray();
		jArr.add(name);
		jArr.add(age);
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print(jArr);
		*/
		
		ArrayList<Member> list = new ArrayList<>();
		list.add(new Member(1, "김개똥", "01012345678"));
		list.add(new Member(2, "박개똥", "01098765432"));
		list.add(new Member(3, "이개똥", "01033557799"));
		list.add(new Member(4, "최개똥", "01022446688"));
		list.add(new Member(5, "서개똥", "01094503954"));
		
		/*
		JSONArray jArr = new JSONArray();
		for(Member m : list) {
			JSONObject jobj = new JSONObject();
			jobj.put("userNo", m.getUserNo());
			jobj.put("userName", m.getUserName());
			jobj.put("phone", m.getPhone());
			
			jArr.add(jobj);			
		}
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print(jArr);
		*/
		response.setContentType("text/html; charset=UTF-8");
		new Gson().toJson(list, response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
