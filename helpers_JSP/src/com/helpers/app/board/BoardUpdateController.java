package com.helpers.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.board.dao.BoardDAO;

public class BoardUpdateController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		Result result = new Result();
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		BoardDAO boardDAO = new BoardDAO();
		req.setAttribute("board", boardDAO.select(boardNumber));
		
		result.setPath("/app/board/update.jsp");
		return result;
	}

}
