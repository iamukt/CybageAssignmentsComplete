package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUsingUrlRewritting
 */
@WebServlet("/SessionUsingUrlRewritting")
public class SessionUsingUrlRewritting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionUsingUrlRewritting() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		sess.setAttribute("user", request.getParameter("username"));
		//Encodes the URL with JsessionId
		//Useful When Client has disabled cookies
		response.sendRedirect(response.encodeRedirectURL("ShowUrlRewritting"));
	
	}

	
}
