import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        String user = request.getParameter("user");
        String ip = request.getRemoteAddr();
        String agent = request.getHeader("User-Agent");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome, " + user + "</h2>");
        out.println("<p>Your IP: " + ip + "</p>");
        out.println("<p>User-Agent: " + agent + "</p>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doGet(request, response);
    }
}
