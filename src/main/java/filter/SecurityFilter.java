package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by admin on 2016/5/10.
 */
public class SecurityFilter extends HttpServlet implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res  =(HttpServletResponse)response;
        HttpSession session=req.getSession();
        String url=req.getRequestURI();
        if(url.endsWith(".css")||url.endsWith(".js")||url.endsWith(".png")||url.endsWith(".jpg")||url.endsWith(".gif")){
            chain.doFilter(req,res);
            return;
        }
        if(session.getAttribute("UserInfo")==null){

            String path=req.getContextPath();
            if(req.getRequestURI()==null||req.getRequestURI().toLowerCase().indexOf("login")<0){
                req.getRequestDispatcher("/login").forward(req,res);
                return;
            }
        }

        chain.doFilter(req,res);
    }
}
