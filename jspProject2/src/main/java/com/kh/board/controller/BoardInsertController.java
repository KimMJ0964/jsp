package com.kh.board.controller;

import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardInsertController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 일반방식이 아닌 multipart/form-data로 전송하는 경우, request로부터 값 추출 불가
		// String boardTitle = request.getParameter("title");
		// System.out.println(boardTitle);
		
		// enctype이 multipart/form-data로 전송이 되었는지 체크
		
		// 파일 업로드를 위한 라이브러리 cos.jar
		// maven 저장소에서 다운로드
		
		// 1. 파일 용량 제한(byte)
		// byte -> kByte -> mByte -> gByte -> tByte
		int maxSize = 1024 * 1024 * 10;		// <- 10 MegaByte
		
		// 2. 전달된 파일을 저장시킬 폴더 경로 가져오기
		String savePath = request.getSession().getServletContext().getRealPath("/resource/board_upfile/");
		
		// new MultipartRequest(request, 저장시킬 폴더의 경로, 용량제한, 인코딩, 이름을 어떻게 변경할지 정해둔 객체);
		MultipartRequest multipartRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy() );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}