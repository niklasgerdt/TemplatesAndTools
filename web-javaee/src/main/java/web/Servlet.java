package web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private Query query;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		System.out.println("jee-servlet");
		String q = query.query();
		res.setContentType("text/html");
		res.getWriter().write(q);
	}
}
