package com.helpers.app.board;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.board.dao.BoardDAO;
import com.helpers.app.board.vo.BoardVO;

public class BoardReceiveWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		
		Result result = new Result();
//		FileDAO fileDAO = new FileDAO();
		BoardDAO boardDAO = new BoardDAO();
		BoardVO boardVO = new BoardVO();
		int boardNumber = 0;
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
		int fileSize = 1024 * 1024 * 5; // 5M
//		request 객체, 업로드할 경로, 파일의 크기, 인코딩 방식, 이름변경정책
//		MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
//		String boardTitle = multipartRequest.getParameter("boardTitle");
//		String boardContent = multipartRequest.getParameter("boardContent");
		int memberNumber = (Integer)req.getSession().getAttribute("memberNumber");
		
//		boardVO.setBoardTitle(boardTitle);
//		boardVO.setBoardContent(boardContent);
		boardVO.setMemberNumber(memberNumber);
		
		boardDAO.insert(boardVO);
		
		boardNumber = boardDAO.getSequence();
		
//		Enumeration<String> fileNames = multipartRequest.getFileNames();
		
//		while(fileNames.hasMoreElements()) {
//			String fileName = fileNames.nextElement();
//			String fileOriginalName = multipartRequest.getOriginalFileName(fileName);
//			String fileSystemName = multipartRequest.getFilesystemName(fileName);
//			
//			if(fileOriginalName == null) {continue;}
//			
//			FileVO fileVO = new FileVO();
//			fileVO.setFileOriginalName(fileOriginalName);
//			fileVO.setFileSystemName(fileSystemName);
//			fileVO.setBoardNumber(boardNumber);
//			
//			fileDAO.insert(fileVO);
//		}
		result.setPath("/board/boardReceiveWriteOK.bo");
		return result;
	}

}
