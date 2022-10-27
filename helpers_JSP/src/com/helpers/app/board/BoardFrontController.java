package com.helpers.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Result;

public class BoardFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		Result result = null;
		
		if(target.equals("/board/boardMain.bo")) {
//			boardMain.jsp
		}else if(target.equals("/board/boardPost.bo")) {
//			boardPost.jsp
		}else if(target.equals("/board/boardWriteGive.bo")) {
//			boardWriteGive.jsp	
		}else if(target.equals("/board/boardWriteReceive.bo")) {
//			boardWriteReceive.jsp
		}else if(target.equals("/board/boardClickAcceptOk.bo")) {
//			BoardClickAcceptOkController
		}else if(target.equals("/board/boardLikeClickOk.bo")) {
//			BoardLikeClickOkController
		}else if(target.equals("/board/boardPostOk.bo")) {
//			BoardPostOkController	
		}else if(target.equals("/board/boardSearchPost.bo")) {
//			BoardSearchPostController
		}else if(target.equals("/board/boardUploadImageOk.bo")) {
//			BoardUploadImageOkController
		}
		
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
			
		}
		
	}
}






























