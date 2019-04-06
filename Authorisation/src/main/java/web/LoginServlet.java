/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.UserType;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import repositories.AuthorisationRepository;

/**
 *
 * @author Falki
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("Username");
        String pass = request.getParameter("Password");
        AuthorisationRepository rep = new AuthorisationRepository();

        UserType rights = rep.checkLogin(name, pass);
        HttpSession session = request.getSession();
        session.setAttribute("loggedin", rights);
        switch (rights) {
            case REGULAR:
                response.sendRedirect("useroptions.jsp");
                break;
            case PREMIUM:
                response.sendRedirect("premiumoptions.jsp");
                break;
            case ADMIN:
                response.sendRedirect(request.getContextPath() + "/listUsers");
                break;
            default:
                response.sendRedirect("error.jsp");
        }
    }
}
