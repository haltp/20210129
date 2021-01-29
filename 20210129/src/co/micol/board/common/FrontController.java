package co.micol.board.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.web.BoardDelete;
import co.micol.board.web.BoardInsert;
import co.micol.board.web.BoardInsertForm;
import co.micol.board.web.BoardList;
import co.micol.board.web.BoardUpdate;
import co.micol.board.web.BoardUpdateForm;
import co.micol.board.web.BoardView;
import co.micol.board.web.MainCommand;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private HashMap<String, Command> map = new HashMap<String, Command>();
    
    public FrontController() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand());	//메인화면 보여주기
		map.put("/boardList.do", new BoardList());	//게시판 리스트 보여주기
		map.put("/boardView.do", new BoardView());	//게시글 상세보기
		map.put("/boardDelete.do", new BoardDelete()); //글 삭제
		map.put("/boardInsertForm.do", new BoardInsertForm()); //새글 등록 폼 호출
		map.put("/boardInsert.do", new BoardInsert());	//새글 등록 버튼 누를때
		map.put("/boardUpdateForm.do", new BoardUpdateForm()); //글 수정 폼 호출
		map.put("/boardUpdate.do", new BoardUpdate()); //글 수정 저장
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI();
		String path = uri.substring(contextPath.length());
		
		Command command = map.get(path);
		String viewPage = command.exec(request, response);
		
		if(!viewPage.endsWith(".do")) viewPage = "/WEB-INF/jsp/" + viewPage+".jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
