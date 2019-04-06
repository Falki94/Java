/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositories.AuthorisationRepository;

@WebServlet("/premium")
public class PremiumServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name =request.getParameter("Username");
        AuthorisationRepository rep = new AuthorisationRepository();
        rep.setRights(name);
    }
}
