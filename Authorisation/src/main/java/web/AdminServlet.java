/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.User;
import domain.UserType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositories.AuthorisationRepository;

/**
 *
 * @author Falki
 */
@WebServlet("/listUsers")
public class AdminServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AuthorisationRepository rep = new AuthorisationRepository();
        List<User> list = rep.getAllUsers();
        PrintWriter writer = response.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += "<head><style>.cell{ width : 200px; font-size: 20px; color: red; }</style></head>";
        htmlResponse += "<body style = \"background-color:powderblue\">";
        htmlResponse += "<TABLE>";
        for (User u : list) {
            htmlResponse += "<TR>";
            htmlResponse += "<TD class = \"cell\">";
            htmlResponse += u.getName();
            htmlResponse += "</TD>";
            htmlResponse += "<TD class = \"cell\">";
            htmlResponse += u.getEmail();
            htmlResponse += "</TD>";
            htmlResponse += "<TD class = \"cell\">";
            UserType number = u.getUserType();
            switch (number) {
                case REGULAR:
                    htmlResponse += "regularUser";
                    break;
                case PREMIUM:
                    htmlResponse += "premiumUser";
                    break;
                case ADMIN:
                    htmlResponse += "adminUser";
                    break;
            }
            htmlResponse += "</TD>";
            htmlResponse += "</TR>";
            htmlResponse += "</BR>";
        }
        htmlResponse += "</TABLE>";
        htmlResponse += "<h3><a href=\"premium.jsp\">Nadaj Prawa Premium</a></h3>";
        htmlResponse += "<h3><a href=\"clear.jsp\">Wyloguj</a></h3>";
        htmlResponse += "</html>";
        writer.println(htmlResponse);
    }

    public void init() {

    }

}
