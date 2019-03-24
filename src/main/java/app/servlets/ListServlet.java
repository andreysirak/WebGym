package app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.model.Model;

public class ListServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Model model = Model.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Views/list.jsp");
        requestDispatcher.forward(req, resp);
    }
	
	
}
