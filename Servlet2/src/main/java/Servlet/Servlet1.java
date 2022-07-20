package Servlet;

import com.github.kristofa.brave.Brave;
import com.github.kristofa.brave.okhttp.BraveTracingInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import zipkin.reporter.Reporter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static sun.net.NetProperties.get;


@WebServlet(urlPatterns={"/client2"},asyncSupported = true)
public class Servlet1 extends HttpServlet{
	private static Logger log = Logger.getLogger("logging");


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String baseurl = "http://localhost:8083/client3";
		String baseurl2 = "http://localhost:8084/sendmeesage4";
		String Response = HttpClient.get(baseurl);
		String Response2 = HttpClient.get(baseurl2);

		PrintWriter out = res.getWriter();
	    out.println(Response);
        out.flush();
        out.close();
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String login= req.getParameter("loginId");
		String password= req.getParameter("password");
		String baseurl = "http://localhost:8083/client3";
		//String baseurl2 = "http://localhost:8086/sendmeesage5";
		String Response = HttpClient.get(baseurl);
		//String Response2 = HttpClient.get(baseurl2);
		log.info(login);
		PrintWriter out = res.getWriter();
		out.println(Response);
		out.flush();
		out.close();
	}

}
