package com.ohgiraffers.parameter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/querystring")
public class FoodServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		String menu = request.getParameter("menu");
		System.out.println("주문할 음식: " + menu);
		
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("수량 : " + num);
		
		int price = Integer.parseInt(request.getParameter("price"));
		System.out.println("가격 : " + price);
		
		
 
	PrintWriter out = response.getWriter();
	
	System.out.println("default response type " + response.getContentType());
	
	response.setContentType("text/html; charset=UTF-8");
	
//	StringBuilder resiponseBuilder= new StringBuilder();
//	resiponseBuilder.append("<!doctype huml>/n")
//	                .append("<html>\n")
//	                .append("<head>\n")
//	                .append("</hean>\n")
//	                .append("<body>\n")
//	                .append("<h1>주문완료</h1>\n")
//	                .append("<body>\n")
//	                .append("</html>");
	
	if(0>price) {
		response.sendError(404,"X 페이지를 찾을 수 없음 X");
	}else {
		out.print("주문이 완료되었습니다   ");
		out.print("주문하신메뉴: "+menu+"  "+"수량: "+ num+"  "+"가격: "+ price);
		
	}
	
//	out.print(resiponseBuilder.toString());
	out.close();
}
}
