package com.helpers.app.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helpers.app.Result;

public class BoardFrontController extends HttpServlet {
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

//		============== boardMain ================

		/*
		 * if(target.equals("/board/boardListOk.bo")) { result = new
		 * BoardListOkController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardWrite.bo")) { result = new
		 * BoardWriteController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardWriteOk.bo")) { result = new
		 * BoardWriteOkController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardDetail.bo")) { result = new
		 * BoardDetailController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardDelete.bo")) { result = new
		 * BoardDeleteController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardUpdate.bo")) { result = new
		 * BoardUpdateController().execute(req, resp);
		 * 
		 * }else if(target.equals("/board/boardUpdateOk.bo")) { result = new
		 * BoardUpdateOkController().execute(req, resp);
		 * 
		 * } else
		 */
//		if (target.equals("/board/boardClickAcceptOk.bo")) {
//			// 수락버튼 눌렀을 시 정보전달
////			BoardClickAcceptOkController
//			result = new BoardClickAcceptOkController().execute(req, resp);
//
//		} else if (target.equals("/board/boardLikeClickOk.bo")) {
//			// 좋아요 눌렀을시 정보 전달
////			BoardLikeClickOkController
//			result = new BoardLikeClickOkController().execute(req, resp);
//
//		} else
		if (target.equals("/board/boardPostOk.bo")) {
			// 글 등록 눌렀을 시 정보 전달
//			BoardPostOkController	
			result = new BoardPostOkController().execute(req, resp);

		} else if (target.equals("/board/boardSearchPost.bo")) {
			// 글 검색했을시 조회 담당
//			BoardSearchPostController
			result = new BoardSearchPostController().execute(req, resp);

//		} else if (target.equals("/board/boardUploadImageOk.bo")) {
////			BoardUploadImageOkController
//			result = new BoardUploadImageOkController().execute(req, resp);

//======================== Give ==============================
		} else if (target.equals("/board/boardGiveMain.bo")) {
//			도움주기 게시판 메인
//			boardGiveMain.jsp
//			result = new Result();
//			result.setPath("/app/board/boardGiveMain.jsp");
			result = new BoardGiveMainController().execute(req, resp);

		} else if (target.equals("/board/boardGivePost.bo")) {
//			도움주기 게시판 글 상세보기
//			boardGivePost.jsp
//			result = new Result();
//			result.setPath("/app/board/boardGivePost.jsp");
			result = new BoardGivePostController().execute(req, resp);

		} else if (target.equals("/board/boardGiveWrite.bo")) {
//			도움주기 게시판 게시글 작성
//			boardGiveWrite.jsp
//			result = new Result();
//			result.setPath("/app/board/boardGiveWrite.jsp");
			result = new BoardGiveWriteController().execute(req, resp);
			
		} else if (target.equals("/board/boardGiveWriteOK.bo")) {
//			도움받기 게시판 게시글 작성 완료
//			boardReceiveWrite.jsp
//			result = new Result();
//			result.setPath("/app/board/boardReceiveWrite.jsp");
			result = new BoardGiveWriteOkController().execute(req, resp);
			
//======================== Receive ===========================
		} else if (target.equals("/board/boardReceiveMain.bo")) {
//			도움받기 게시판 메인
//			boardReceiveMain.jsp
//			result = new Result();
//			result.setPath("/app/board/boardReceiveMain.jsp");
			result = new BoardReceiveMainController().execute(req, resp);

		} else if (target.equals("/board/boardReceivePost.bo")) {
//			도움받기 게시판 게시글 상세보기
//			boardReceivePost.jsp
//			result = new Result();
//			result.setPath("/app/board/boardReceivePost.jsp");
			result = new BoardReceivePostController().execute(req, resp);

		} else if (target.equals("/board/boardReceiveWrite.bo")) {
//			도움받기 게시판 게시글 작성
//			boardReceiveWrite.jsp
//			result = new Result();
//			result.setPath("/app/board/boardReceiveWrite.jsp");
			result = new BoardReceiveWriteController().execute(req, resp);
			
		} else if (target.equals("/board/boardReceiveWriteOK.bo")) {
//			도움받기 게시판 게시글 작성 완료
//			boardReceiveWrite.jsp
//			result = new Result();
//			result.setPath("/app/board/boardReceiveWrite.jsp");
			result = new BoardReceiveWriteOkController().execute(req, resp);
			
		}

		if (result != null) {
			if (result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			} else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}

		}

	}
}
