/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import domain.UserType;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy; 
import org.mockito.runners.MockitoJUnitRunner;
import repositories.AuthorisationRepository;
import web.HomeServlet;

@RunWith(MockitoJUnitRunner.class)
public class TestAuthorisation extends Mockito {

    @Mock
    AuthorisationRepository repository;

    @Spy
    HomeServlet servlet;

    @Test
    public void should_properly_redirect_user() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        servlet.doGet(request, response);
        verify(response).sendRedirect("login.jsp");
    }

    @Test
    public void should_not_properly_redirect_user() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        servlet.doGet(request, response);
        verify(response).sendRedirect("login1.jsp");
    }

    @Test
    public void should_properly_check_user() throws IOException, ServletException, SQLException {
        when(repository.checkLogin("Admin", "admin")).thenReturn(UserType.ADMIN);
        assertEquals(repository.checkLogin("Admin", "admin"), UserType.ADMIN);
    }

    @Test
    public void should_not_properly_check_user() throws IOException, ServletException, SQLException {
        when(repository.checkLogin("Admin", "admin")).thenReturn(UserType.ADMIN);
        assertEquals(repository.checkLogin("Admin", "admin"), UserType.PREMIUM);
    }
}
