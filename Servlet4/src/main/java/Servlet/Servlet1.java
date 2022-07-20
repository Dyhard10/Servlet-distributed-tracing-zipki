package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/client4")
public class Servlet1 extends HttpServlet{
	private static Logger log = Logger.getLogger("logging");
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String baseurl = "http://localhost:8085/client5";
		
		String Response = HttpClient.get(baseurl);
		log.info(Response);

		PrintWriter out = res.getWriter();
	    out.println(Response);
        out.flush();
        out.close();
	}

}
