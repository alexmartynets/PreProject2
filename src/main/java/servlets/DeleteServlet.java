package servlets;

import dao.UserHibernateDAO;
import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = null;
        user = userService.getUserById(id);
        assert user != null;
        String name = user.getName();
        request.setAttribute("id", id);
        request.setAttribute("name", name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/deleteUser.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(userService.getUserById(id));
        request.getRequestDispatcher("/list").forward(request, response);
    }
}
