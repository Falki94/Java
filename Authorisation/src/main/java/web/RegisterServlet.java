/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositories.AuthorisationRepository;
import sun.security.util.Password;

/**
 *
 * @author Falki
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("Username");
        String pass = request.getParameter("Password");
        String confirm = request.getParameter("confirmPassword");
        String email = request.getParameter("Email");
        if (name.isEmpty()) {
            printError(response, "Nazwa uzytkownika musi byc podana");
            return;
        }
        if (pass.length()<5){
            printError(response, "Haslo musi zawierac minimum  5 znakow");
            return;
        }
        if (!email.contains("@.") || email.length()<8){
            printError(response, "Musisz wprowadzic prawdziwy adres mailowy");
            return;
        }
        User user = new User();
        user.setName(name);
        user.setPassword(pass);
        user.setEmail(email);
        AuthorisationRepository rep = new AuthorisationRepository();
        rep.addUser(user);
        PrintWriter writer = response.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += "Dodano uzykownika " + "\"" + user.getName() + "\"";
        htmlResponse += "</html>";
        writer.println(htmlResponse);
    }

    private void printError(HttpServletResponse response, String msg) throws IOException {
        PrintWriter writer = response.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += msg;
        htmlResponse += "</html>";
        writer.println(htmlResponse);
    }

}
