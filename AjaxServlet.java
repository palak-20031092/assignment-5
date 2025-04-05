import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        String name = request.getParameter("name");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"message\": \"Hello, " + name + "!\"}");
    }
}
