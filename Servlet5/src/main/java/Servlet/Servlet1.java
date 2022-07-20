package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/client5")
public class Servlet1 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String baseurl = "http://localhost:8085/sendmeesage5";
		
		String Response = HttpClient.get(baseurl);
		PrintWriter out = res.getWriter();
	    out.println(Response);
        out.flush();
        out.close();
	}

}
