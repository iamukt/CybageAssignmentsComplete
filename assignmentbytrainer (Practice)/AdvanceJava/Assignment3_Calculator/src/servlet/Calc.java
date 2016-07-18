/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a calculator using jsp and servlet
 * Role of this File: The following program implement the above concept
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int result;
		String choice = request.getParameter("operation");
		switch(choice)
		{
			case "add": 
				result = num1+num2;	
				out.println("Addition of "+num1+" "
					+ "and "
					+num2
					+" is: "
					+result
					);
					break;
			case "sub":
					result = num1-num2;	
					out.println("Subtraction of "+num1+" "
					+ "and "
					+num2
					+" is: "
					+result
					);
					break;
			case "mul":
					result = num1*num2;	
					out.println("Multiplication of "+num1+" "
					+ "and "
					+num2
					+" is: "
					+result
					);
					break;
			case "div":
					result = num1/num2;	
					out.println("Division of "+num1+" "
					+ "and "
					+num2
					+" is: "
					+result
					);
					break;
		}
	}

}
