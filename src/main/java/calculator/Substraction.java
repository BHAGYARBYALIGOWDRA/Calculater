package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/sub")
public class Substraction implements Servlet {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1=req.getParameter("num1");
		String n2=req.getParameter("num2");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("the Substraction of "+n1+"and"+n2+"is"+(n1-n2));
		 
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().print("<html><body><h1 style='color:red;'>The substraction of"+num1+"and"+num2+"is"+(num1-num2)+"</html></body></h1>");
	}

	
	
}
