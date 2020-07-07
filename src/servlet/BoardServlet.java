package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;//지문같은 역할. 있는게 좋다.
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/heml;charset=utf-8");//여기서 메모리 생성.
		PrintWriter pw = response.getWriter();
		String str = "GET으로 오셨군요";
		String name = request.getParameter("name");
		str += "name ="+name;
		pw.print(str);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/heml;charset=utf-8");//여기서 메모리 생성.
		request.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		String str = "POST으로 오셨군요";
		String name = request.getParameter("name");
		str += "name ="+name;
		pw.print(str);
	}
}
