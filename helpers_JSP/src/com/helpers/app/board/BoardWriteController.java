package com.helpers.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Execute;
import com.helpers.app.Result;
import com.helpers.app.member.dao.MemberDAO;

public class BoardWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		int memberNumber = 0;
		Result result = new Result();
		MemberDAO memberDAO = new MemberDAO();
		try {
			memberNumber = (Integer)req.getSession().getAttribute("memberNumber");
			req.setAttribute("memberId", memberDAO.getMemberId(memberNumber));
			result.setPath("/app/board/write.jsp");
			
		} catch (Exception e) {
			result.setPath("/member/login.me");
		}
		return result;
	}

}
