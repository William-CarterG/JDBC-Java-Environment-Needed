import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class UpdateExtension extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String id = req.getParameter("id");
        String extension = req.getParameter("extension");
        toClient.println(Utils.header("Update extension"));
        toClient.println("<h3 align='center'>Update of extension of employees: " + id + "</h3>");
        toClient.println("<h3 align='center'>to new extension : " + extension + "</h3>");
        toClient.println(Utils.footer("Update extension"));
        toClient.close();
    }
}