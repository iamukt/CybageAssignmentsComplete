/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a simple Servlet to show the 
 * lifecycle of the servlet
 * Role of this File: The following program implement the above concept
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LifeCycle() {
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    public void init() throws ServletException 
    {
    	System.out.println("Servlet Instantiated");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet in doPost method");
	}
    @Override
    public void destroy()
    {
    	System.out.println("Servlet Destroyed");
    }

}
