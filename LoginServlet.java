import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        if ("admin".equals(user) && "1234".equals(pass)) {
            RequestDispatcher rd = request.getRequestDispatcher("welcome");
            rd.forward(request, response);
        } else {
            response.sendRedirect("login.jsp?error=Invalid+Credentials");
        }
    }
}
