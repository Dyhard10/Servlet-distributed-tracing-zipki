package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendmeesage5")
public class Servlet2 extends HttpServlet{

    private static Logger log = Logger.getLogger("logging");
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Your Order is sucessfully placed");
        log.info("ayoooo");

        out.flush();
        out.close();
    }

}
