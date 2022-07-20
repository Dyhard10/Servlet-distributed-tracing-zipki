package Servlet;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample3")
public class Servlet2 extends HttpServlet{
	
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.println("Hello World!");
//        out.flush();
//        out.close();
        HttpPost post = new HttpPost("http://jakarata.apache.org/");
        NameValuePair[] data = {
                new NameValuePair("user", "joe"),
                new NameValuePair("password", "bloggs")
        };
    }

}
