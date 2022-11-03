package com.helpers.app.board;

import java.io.File;
import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.board.dao.BoardDAO;
//import com.helpers.app.file.dao.FileDAO;

public class BoardDeleteController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		Result result = new Result();
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload";
		BoardDAO boardDAO = new BoardDAO();
//		FileDAO fileDAO = new FileDAO();
		
//		fileDAO.select(boardNumber).stream().map(file -> file.getFileSystemName()).forEach(name -> {
//			File file = new File(uploadPath, name);
//			if(file.exists()) {
//				file.delete();
//			}
//		});
		
//		fileDAO.delete(boardNumber);
//		boardDAO.delete(boardNumber);
		result.setRedirect(true);
		result.setPath("/board/boardListOk.bo");
		return result;
	}

}

















