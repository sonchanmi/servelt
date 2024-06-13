package com.ohgiraffers.auth.member.model.service;



import org.apache.ibatis.session.SqlSession;

import com.ohgiraffers.auth.member.model.dao.MemberDAO;
import com.ohgiraffers.auth.member.model.dto.MemberDTO;

import static com.ohgiraffers.auth.common.mybatis.Template.getSqlSession;


public class MemberService {
	
	private MemberDAO memberDAO;

	public int registMember(MemberDTO requestMember) {
		
		
		SqlSession session = getSqlSession();
		memberDAO = session.getMapper(MemberDAO.class);
		
		int result = memberDAO.insertMember(requestMember);
		
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}
	
}
