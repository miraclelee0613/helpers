package com.helpers.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.board.dao.BoardDAO;
import com.helpers.app.board.vo.BoardDTO;

public class BoardGivePostController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		Result result = new Result();
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		BoardDAO boardDAO = new BoardDAO();
//		FileDAO fileDAO = new FileDAO();
		BoardDTO boardDTO = boardDAO.select(boardNumber);
//		boardDTO.setFiles(fileDAO.select(boardNumber));
		req.setAttribute("board", boardDTO);
		
		result.setPath("/app/board/detail.jsp");
		return result;
	}

}
