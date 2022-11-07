package com.helpers.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.helpers.app.board.vo.BoardDTO;
import com.helpers.app.board.vo.BoardVO;
import com.mybatis.config.MyBatisConfig;

public class BoardDAO {
	public SqlSession sqlSession;
	
	public BoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void post(BoardVO boardVO) {
		sqlSession.insert("board.post", boardVO);
	}
	
	public int login(String memberId, String memberPw){
		HashMap<String, String> loginMap = new HashMap<String, String>();
		loginMap.put("memberId", memberId);
		loginMap.put("memberPw", memberPw);
		
		return sqlSession.selectOne("member.login", loginMap);
	}

	public List<BoardDTO> selectAll(HashMap<String, Integer> pageMap) {
		return sqlSession.selectList("board.selectAll", pageMap);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("board.getTotal");
	}
	
	public void insert(BoardVO boardVO) {
		sqlSession.insert("board.insert", boardVO);
	}
	
	public int getSequence() {
		return sqlSession.selectOne("board.getSequence");
	}
	
	public BoardDTO select(int boardNumber) {
		return sqlSession.selectOne("board.select", boardNumber);
	}
	
	public void delete(int boardNumber) {
		sqlSession.delete("board.delete", boardNumber);
	}
	
	public void update(BoardVO boardVO) {
		sqlSession.update("board.update", boardVO);
	}
	
}















