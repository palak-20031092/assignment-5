import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/config")
public class ConfigServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String dbURL = config.getInitParameter("dbURL");

        ServletContext context = getServletContext();
        context.setAttribute("dbInfo", dbURL);

        PrintWriter out = response.getWriter();
        out.println("Database URL from ServletConfig: " + dbURL);
    }
}
