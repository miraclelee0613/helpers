package com.helpers.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Result;

public class AdminFrontController extends HttpServlet{
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
		
		if(target.equals("/admin/index.admin")) {
//			adminIndex.jsp로 이동
			result = new Result();
			result.setPath("/app/admin/adminIndex.jsp");
		}else if(target.equals("/admin/certificate.admin")) {
//			certificate.jsp로 이동
			result = new Result();
			result.setPath("/app/admin/certificate.jsp");
		}else if(target.equals("/admin/post.admin")) {
//			post.jsp로 이동		
			result = new Result();
			result.setPath("/app/admin/post.jsp");

		}else if(target.equals("/admin/qna.admin")) {
//			qna.jsp로 이동
			result = new Result();
			result.setPath("/app/admin/qna.jsp");
		}else if(target.equals("/admin/userlist.admin")) {
//			userlist.jsp로 이동
			result = new Result();
			result.setPath("/app/admin/userList.jsp");
		}else if(target.equals("/admin/deleteOk.admin")) {
			result = new AdminDeleteOkController().execute(req, resp);
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






























