/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.UserType;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Falki
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpServletRequest httpRequest = request;
        HttpServletResponse httpResponse = response;
        HttpSession session = httpRequest.getSession();
        UserType rights = (UserType) session.getAttribute("loggedin");
        if (rights != null) {
            switch (rights) {
                case REGULAR:
                    httpResponse.sendRedirect("useroptions.jsp");
                    break;
                case PREMIUM:
                    httpResponse.sendRedirect("premiumoptions.jsp");
                    break;
                case ADMIN:
                    httpResponse.sendRedirect(request.getContextPath() + "/listUsers");
                    break;
                default:
                    httpResponse.sendRedirect("error.jsp");
            }
        } else {
            httpResponse.sendRedirect("login.jsp");
        }
    }
    public void init(ServletConfig config) throws ServletException {
        
    }
}
