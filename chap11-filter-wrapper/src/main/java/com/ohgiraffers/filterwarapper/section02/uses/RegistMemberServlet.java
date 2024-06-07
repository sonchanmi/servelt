package com.ohgiraffers.filterwarapper.section02.uses;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
	
		System.out.println("userId: "+userId);
		System.out.println("password: "+password);
		System.out.println("name: "+name);
	
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		//BCryptPasswordEncoder lib에서 가져와 줘야 사용 할 수 있음 
		System.out.println("password == pass01 ?" +passwordEncoder.matches("pass01", password));
		System.out.println("password == pass02 ?" +passwordEncoder.matches("pass02", password));
		// 패스워드가 입력한 값이 맞는지 true false로 출력되는 함수 
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + name + "님 회원 가입을 축하합니다 !~ </h1>");
		out.println("</body>");
		out.println("</html>");
		
	  out.close();
	}

}
