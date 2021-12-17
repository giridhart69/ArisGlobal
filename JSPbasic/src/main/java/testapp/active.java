package testapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class active extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String no1=req.getParameter("num1");
		String no2=req.getParameter("num2");
		System.out.println(no1);
		System.out.println(no2);
		req.setAttribute("num1",no1);
		req.setAttribute("num2",no2);
		//PrintWriter out=resp.getWriter();
		//int c=Integer.parseInt(no1)+Integer.parseInt(no2);
		//String d=String.valueOf(c);
		//out.println(c);
		//req.setAttribute("c",d);
		RequestDispatcher rd=req.getRequestDispatcher("output.jsp");
		rd.forward(req, resp);
	}
}
