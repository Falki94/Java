package web.filters;

import domain.UserType;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(servletNames={"HomeServlet"})
@WebFilter("/login1111")
public class AuthorisationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        Integer rights = (Integer) session.getAttribute("loggedin");
        if (rights != null) {
            switch (rights) {
                case 0:
                    httpResponse.sendRedirect("useroptions.jsp");
                    break;
                case 1:
                    httpResponse.sendRedirect("premiumoptions.jsp");
                    break;
                case 2:
                    httpResponse.sendRedirect(httpRequest.getContextPath() + "/listUsers");
                    break;
                default:
                    httpResponse.sendRedirect("error.jsp");
            }
        }
        else {
            httpResponse.sendRedirect("login.jsp");
        }
         chain.doFilter(request,response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
   
}
