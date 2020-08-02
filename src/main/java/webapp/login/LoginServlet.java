package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private LoginService user = new LoginService();
	private TodoService todoService = new TodoService();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	    {
		   	String name = req.getParameter("name");
			req.setAttribute("name", name);
			String password = req.getParameter("password");
//			req.setAttribute("password", password);
			boolean value = user.isUserValid(name, password);
			if(value) {
				req.getSession().setAttribute("name", name);
				resp.sendRedirect("/todo.do");
//				req.setAttribute("todos", todoService.retrieveTodos());
//		    	req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
			}
			else {
				req.setAttribute("errorMsg", "InvalidCredentials!");
				req.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(req, resp);
			}
	    }
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	    {
			req.setAttribute("name", req.getParameter("name"));
			req.setAttribute("pass", req.getParameter("password"));
	    	req.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(req, resp);
	    }
	
}
