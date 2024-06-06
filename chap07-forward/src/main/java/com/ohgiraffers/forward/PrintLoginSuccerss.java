package com.ohgiraffers.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/print")
public class PrintLoginSuccerss extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//forword받은 서블릿에서도 요청방식이 get이면 doGet 메소드를, 요청 방식이 post이면 doPst메소드 호출	   //form으로 post받아줘서 do post쓰임
	
     String userId =request.getParameter("userId");		
		
     String userName =(String)request.getAttribute("userName");
     
    StringBuilder responseText = new StringBuilder();
    responseText.append("<!doctype html>\n")
    .append("<html>\n")
    .append("<head>\n")
    .append("</head>\n")
    .append("<body>\n")
    .append("<h3>" + userId + "님 환영합니다!</h3>\n")
    .append("<h3>" + userName + "님 환영합니다!</h3>\n")
    .append("</body>\n")
    .append("</html>");
    
    response.setContentType("text/html; chatset=UTF-8");
    PrintWriter out = response.getWriter();
    out.print(responseText.toString());
	out.close();
	
	}

}
