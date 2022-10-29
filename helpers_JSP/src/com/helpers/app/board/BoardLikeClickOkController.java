package com.helpers.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.board.dao.BoardDAO;
import com.helpers.app.board.vo.BoardVO;


public class BoardLikeClickOkController implements Execute{
//좋아요 눌렀을시 정보 전달
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO boardVO = new BoardVO();
		Result result = new Result();
		
		boardVO.setMemberNumber
		boardVO.setBoardNumber
		boardVO.setBoardTitle
		boardVO.setBoardContent
		boardVO.setBoardDate
		boardVO.setBoardReadCount
		
		return null;
	}
	
}
