package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUsingHiddenFormElement
 */
@WebServlet("/SessionUsingHiddenFormElement")
public class SessionUsingHiddenFormElement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionUsingHiddenFormElement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Hidden element is not visible to the user 
		//But it is available as a parameter in servlet
		String user = request.getParameter("hiddenValue");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello "+user);
	}
}

