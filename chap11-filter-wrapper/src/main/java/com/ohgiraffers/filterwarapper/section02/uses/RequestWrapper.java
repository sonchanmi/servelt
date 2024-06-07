package com.ohgiraffers.filterwarapper.section02.uses;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper{

	public RequestWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		String value ="";
		
		if("password".equals(name)) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			value = passwordEncoder.encode(super.getParameter(name)); //넣어준 문자열을 암호화 시켜서 반환해줌
		}else {
		  value = super.getParameter(name);	
		}
		return value;
	}

}
