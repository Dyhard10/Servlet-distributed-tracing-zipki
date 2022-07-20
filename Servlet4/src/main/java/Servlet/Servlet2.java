package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/sendmeesage4"},asyncSupported = true)
public class Servlet2 extends HttpServlet{
    private static Logger log = Logger.getLogger("logging");
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final long startTime = System.nanoTime();
        final AsyncContext asyncContext = req.startAsync(req, resp);
//        final long NANOSEC_PER_SEC = 1000l*1000*1000;
//        int x=0;
//        while ((System.nanoTime()-startTime)< 1*60*NANOSEC_PER_SEC){
//                        // do stuff
//            x+=1;
//        }
//        log.info("while loop is over");
//        String baseurl = "http://localhost:8085/client5";
//
//        String Response = HttpClient.get(baseurl);
//        log.info(Response);
//
//        PrintWriter out = resp.getWriter();
//        out.println(Response);
//        out.flush();
//        out.close();

        new Thread() {

            @Override
            public void run() {
                try {
                    ServletResponse response = asyncContext.getResponse();
                    response.setContentType("text/plain");
                    PrintWriter out = response.getWriter();
                    Thread.sleep(60000);
                    out.print("Work completed. Time elapsed: " + (System.nanoTime() - startTime));
                    out.flush();
                    asyncContext.complete();
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

    }


}
