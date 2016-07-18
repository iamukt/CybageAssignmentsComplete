package cyb.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if(request.getParameter("num1").equals("") || request.getParameter("num2").equals("")){
			pw.write("<span style='color:red'>You left off the number field/s blank</span>");
			pw.write("<br><a href='/Calculator/index.html' >click to go home</a>");
			return;
		}
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String option = request.getParameter("option");
		
		
		switch (option) {
			case "add":
				pw.write("Addition of "+num1+" and "+num2+" is "+(num1+num2));
				break;
			case "subtract":
				pw.write("Substration of "+num1+" and "+num2+" is "+(num1-num2));
				break;
			case "multiply":
				pw.write("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
				break;
			case "divide":
				if(num2==0){
					pw.write("<span style='color:red'>Number 2 cannot be zero for division.</span>");
				}
				else{
					pw.write("Division of "+num1+" and "+num2+" is "+((double)num1/(double)num2));
				}
				break;
		}
		pw.write("<br><a href='/Calculator/index.html' >click to go home</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
