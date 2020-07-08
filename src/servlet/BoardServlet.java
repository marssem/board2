package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;

public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;//지문같은 역할. 있는게 좋다.
	private BoardService boardService = new BoardService();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html;charset=utf-8");//여기서 메모리 생성.
		PrintWriter pw = response.getWriter();
		List<Map<String,Object>> boardList = boardService.getBoardList();
		String html = "<!doctype html>\r\n"
		+"<html>\r\n"
		+"<head>\r\n"
		+"<meta charset=\"utf-8\">\r\n"
		+"</head>\r\n"
		+"<body>\r\n"
		+"<table border=\"1\">\r\n"
		+"<tr>\r\n"
		+"<th>번호</th>"
		+"<th>제목</th>"
		+"<th>작성일</th>"
		+"<th>작성자</th>"
		+"</tr>";
		for(Map<String,Object> board:boardList) {
			html += "<tr>";
			html += "<td>" + board.get("num") + "</td>";
			html += "<td>" + board.get("title") + "</td>";
			html += "<td>" + board.get("content") + "</td>";
			html += "<td>" + board.get("creusr") + "</td>";
			html += "</tr>";
		}
		html+= "</table>\r\n"
				+"</body>\r\n"
				+ "</html>";
		pw.print(html);//출력
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/heml;charset=utf-8");//여기서 메모리 생성.
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String creusr = request.getParameter("creusr");
		Map<String,Object> board =new HashMap<>();
		board.put("title",title);
		board.put("content",content);
		board.put("creusr",creusr);
		
		
		int result = boardService.insertBoard(board);
		PrintWriter pw = response.getWriter();
	
	//	String name = request.getParameter("name");
	//	str += "name = "+name;
	//	pw.print(str);
		if(result==1) {
			pw.println("저장 완료");
		}else {
			pw.println("저장 실패");
		}
		
	}
}
