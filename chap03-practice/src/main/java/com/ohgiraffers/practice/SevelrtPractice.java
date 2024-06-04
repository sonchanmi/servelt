package com.ohgiraffers.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request-service")
public class SevelrtPractice extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String httpMethod= request.getMethod();
		System.out.println("http method:"+ httpMethod);
		
		if("GET".equals(httpMethod)) {
			doGet(request,response);
		}else if("POST".equals(httpMethod)) {
			doPost(request,response);
		}
	}

}
