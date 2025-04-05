import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/secure/*")
public class AuthFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            chain.doFilter(req, res);
        } else {
            ((HttpServletResponse) res).sendRedirect("/login.jsp");
        }
    }
}
