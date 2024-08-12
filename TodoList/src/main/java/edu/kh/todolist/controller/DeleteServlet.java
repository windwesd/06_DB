package edu.kh.todolist.controller;

import java.io.IOException;

import edu.kh.todolist.service.TodoListService;
import edu.kh.todolist.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 전달 받은 파라미터 얻어오기
		int index = Integer.parseInt(req.getParameter("index"));
		
		try {
			TodoListService service = new TodoListServiceImpl();
			
			// 서비스 호출 후 결과 반환 받기
			String title = service.todoDelete(index);
			
			// 삭제 성공 시
			// -> 메인 페이지(/)로 redirect 후
			// -> "000"이 삭제 되었습니다 alert() 출력하기
			
			// 삭제 실패 시 == index가 잘못 됨
			// -> "해당 index 번째 todo가 존재하지 않습니다" alert()
			
			HttpSession session = req.getSession();
			
			String result = null;
			if(title != null) result = title + " 할 일이 삭제 되었습니다";
			else 			  result = "해당 index번째 todo가 존재하지 않습니다";
			
			resp.sendRedirect("/");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
