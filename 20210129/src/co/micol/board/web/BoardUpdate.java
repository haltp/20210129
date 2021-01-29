package co.micol.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.common.Command;
import co.micol.board.dao.BoardDao;
import co.micol.board.vo.BoardVo;

public class BoardUpdate implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 글 수정 저장버튼 누를때
		BoardDao dao = new BoardDao();
		BoardVo vo = new BoardVo();
		vo.setbId(Integer.parseInt(request.getParameter("bId22")));
		vo.setbContent(request.getParameter("bContent"));
		
		int n = dao.update(vo);
		
		String viewPage = null;
		
		if(n!=0) {
			viewPage = "board/updateSucces";
		} else {
			viewPage = "board/updateFail";
		}
		
		return viewPage;
	}

}
