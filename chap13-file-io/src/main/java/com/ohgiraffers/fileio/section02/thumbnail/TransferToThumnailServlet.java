package com.ohgiraffers.fileio.section02.thumbnail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/transferToThumbnail")
public class TransferToThumnailServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String originFilePath ="D:\\workspace\\01_servelt\\chap13-file-io\\src\\main\\webapp\\resources\\origin-image\\nature";
		String saveFilePath = "D:\\workspace\\01_servelt\\chap13-file-io\\src\\main\\webapp\\resources\\tumb-image\\";
		
		new TransferToThumbnailImageModule().changeThumbnail(originFilePath, saveFilePath);
	
	}

}
