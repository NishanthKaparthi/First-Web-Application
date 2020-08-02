package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
	private TodoService todoService = new TodoService();
	private Todo todo = new Todo();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	    {
		   	String param = req.getParameter("todo");
		   	todoService.addTodo(param);
		   	req.setAttribute("todos", todoService.retrieveTodos());
			resp.sendRedirect("/todo.do");
//			String password = req.getParameter("password");
//			req.setAttribute("password", password);
//			boolean value = user.isUserValid(name, password);
//			if(value) {
//				req.setAttribute("todos", todoService.retrieveTodos());
//		    	req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
//			}
//			else {
//				req.setAttribute("errorMsg", "InvalidCredentials!");
//				req.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(req, resp);
//			}
			
	    } 
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	    {
			req.setAttribute("name", req.getParameter("name"));
//			req.setAttribute("pass", req.getParameter("password"));
//	    	req.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(req, resp);
			req.setAttribute("todos", todoService.retrieveTodos());
			req.getRequestDispatcher("/WEB-INF/views/Todo.jsp").forward(req, resp);
	    }
	
}
