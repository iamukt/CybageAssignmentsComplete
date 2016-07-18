/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a simple servlet to print hello message 
 * with username 
 * Role of this File: The following program implement the above concept
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserNameServlet
 */
@WebServlet("/UserNameServlet")
public class UserNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserNameServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(
			username.equals("admin")
			&&
			password.equals("admin")
		)
		{
			 out.println("<body>"
			 		+ "Hello"
			 		+ " "
			 		+ username
			 		+ "</body>");
			 
		}
		else
			out.println("<body>"
			 		+ "No"
			 		+ " User Logged In"
			 		+ "</body>");
		
	}

}
