package cyb.jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigTest
 */
@WebServlet("/ConfigTest")
public class ConfigTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		ServletContext context = getServletContext();
		//pw.write("<br><br><br>yekya hai");
		//pw.write("<br>Database Url : "+context.getInitParameter("dbUrl"));
		//pw.write("<br><br><br>yekya hai");
		//pw.write("<br>Database Username : "+context.getInitParameter("dbUsername"));
		//pw.write("<br><br><br>yekya hai");
		//pw.write("<br>Database Password : "+context.getInitParameter("dbPassword"));
		//pw.write("<br><br><br>yekya hai");
		//pw.write("<br><h1><br>KUCH NAHI HAI</h1>");
		
		Enumeration<String > enumlist = context.getInitParameterNames();
		while(enumlist.hasMoreElements()){
			String key = enumlist.nextElement();
			pw.write(key+" : "+context.getInitParameter(key)+"<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
