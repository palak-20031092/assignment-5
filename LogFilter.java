import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.util.Date;

@WebFilter("/*")
public class LogFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
        throws IOException, ServletException {
        System.out.println("IP: " + req.getRemoteAddr() + ", Time: " + new Date());
        chain.doFilter(req, res);
    }
}
