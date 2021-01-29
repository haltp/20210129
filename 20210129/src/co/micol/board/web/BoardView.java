package co.micol.board.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.common.Command;
import co.micol.board.dao.BoardDao;
import co.micol.board.vo.BoardVo;
import co.micol.board.vo.ReplyVo;

public class BoardView implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 글 상세보기
		BoardDao dao = new BoardDao();
		BoardVo vo = new BoardVo();
		ReplyVo rvo = new ReplyVo();
		ArrayList<ReplyVo> list = new ArrayList<ReplyVo>(); //댓글 담기
		
		vo.setbId(Integer.parseInt(request.getParameter("bId")));
		rvo.setbId(Integer.parseInt(request.getParameter("bId"))); //댓글 가져오기
		
		vo = dao.select(vo); //주인 글을 읽기
		dao = new BoardDao();
		list = dao.replySelect(rvo); //댓글 읽기
		
		request.setAttribute("vo", vo); //주인 글값을 받아온다
		request.setAttribute("rrlist", list); //rlist라는 이름으로 list값 담자, 댓글
		
		return "board/boardView";
	}

}
