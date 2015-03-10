package nl.sogeti.kornuit.servlets;

import nl.sogeti.kornuit.controller.DatabaseController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nathan on 10/03/2015.
 */
public class verwijderPersoonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        DatabaseController db = new DatabaseController();
        db.verwijderPersoon(username);
    }
}
