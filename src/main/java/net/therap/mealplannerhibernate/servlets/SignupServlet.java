package net.therap.mealplannerhibernate.servlets;

import net.therap.mealplannerhibernate.service.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author rayed
 * @since 10/26/16 11:39 AM
 */

@WebServlet(name = "SignupServlet", urlPatterns = {"/Signup.do"})
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputEmail = request.getParameter("inputEmail");
        String inputPassword = request.getParameter("inputPassword");

        //System.out.println(inputEmail + " -------------------- " + inputPassword);

        UserManager userManager = new UserManager();
        boolean userAdded = userManager.addUser(inputEmail, inputPassword);

        if (userAdded){
            HttpSession session = request.getSession();
            session.setAttribute("inputEmail", inputEmail);
            session.setAttribute("inputPassword", inputPassword);
            response.sendRedirect("HomePage.jsp");
        } else {
            //request.getSession().setAttribute("error", "failed");
            request.setAttribute("message", "sign up failed");
            request.getRequestDispatcher("/signup.jsp").include(request, response);
            //response.sendRedirect("signup.jsp");
        }


    }
}
