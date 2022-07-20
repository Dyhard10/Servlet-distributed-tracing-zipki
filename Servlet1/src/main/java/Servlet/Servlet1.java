package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/client")
public class Servlet1 extends HttpServlet{
	private static Logger log = Logger.getLogger("logging");
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		log.info("in the first client");
		String baseurl = "http://localhost:8082/client2";
		
		String Response = HttpClient.get(baseurl);
		PrintWriter out = res.getWriter();
		log.info(Response);
	    out.println(Response);
        out.flush();
        out.close();
	}

}
