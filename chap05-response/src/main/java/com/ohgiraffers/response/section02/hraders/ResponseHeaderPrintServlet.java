package com.ohgiraffers.response.section02.hraders;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderPrintServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html; charset=UTF-8");
		// 1. 응답 content-type 설정
		PrintWriter out = response.getWriter();
		//2.응답 stream 얻어오기
		out.print("<h1>현재 시간은" + System.currentTimeMillis()+"입니다.</h1>");
		//3.응답 내보내기 (참고: System.currentTimeMillis())
		out.close();
		//4.stream 자원반납
		
		
		Collection<String> responseHeaders = response.getHeaderNames();
		Iterator<String> iter = responseHeaders.iterator();
		while(iter.hasNext()) {
			String headerName = iter.next();
			System.out.println(headerName + " : "+ response.getHeader(headerName));
		}
		
	}

}
