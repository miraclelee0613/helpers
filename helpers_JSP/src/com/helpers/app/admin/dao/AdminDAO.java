package com.helpers.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class AdminDAO {
	public SqlSession sqlSession;
	
	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	public boolean checkId(String memberId) {
//		return (Integer)sqlSession.selectOne("member.checkId", memberId) == 0;
//	}
}















