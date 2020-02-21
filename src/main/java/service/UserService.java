package service;

import dao.UserHibernateDAO;
import model.User;
import utils.DBHelper;

import java.util.List;

public class UserService {

    public void saveUser(User user) {
        UserHibernateDAO userHibernateDAO = new UserHibernateDAO();
        userHibernateDAO.saveUser(user);
    }

    public User getUserById(long id) {
        UserHibernateDAO userHibernateDAO = new UserHibernateDAO();
        return userHibernateDAO.getUserById(id);
    }

    public List<User> getAllUsers() {
        UserHibernateDAO userHibernateDAO = new UserHibernateDAO();
        return userHibernateDAO.getAllUsers();
    }

    public void updateUser(User user) {
        UserHibernateDAO userHibernateDAO = new UserHibernateDAO();
        userHibernateDAO.updateUser(user);
    }

    public void deleteUser(User user) {
        UserHibernateDAO userHibernateDAO = new UserHibernateDAO();
        userHibernateDAO.deleteUser(user);
    }
}
