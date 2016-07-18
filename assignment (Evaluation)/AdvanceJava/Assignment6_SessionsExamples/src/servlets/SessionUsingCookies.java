package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionUsingCookies
 */
@WebServlet("/SessionUsingCookies")
public class SessionUsingCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SessionUsingCookies() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Declaring Cookies
		Cookie ck = new Cookie("username",request.getParameter("username"));
		//Adding cookie to the response
		response.addCookie(ck);
		//Sending to Show Cookie servlet
		response.sendRedirect("ShowCookie");
	}
}
