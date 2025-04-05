import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionExample extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("theme", "dark");
        String theme = (String) session.getAttribute("theme");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Theme: " + theme + "</p>");
    }
}
