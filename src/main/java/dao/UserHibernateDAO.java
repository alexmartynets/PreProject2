package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.DBHelper;

import java.util.List;

public class UserHibernateDAO implements UserDAO{
    private Session session;

    public UserHibernateDAO() {
        this.session = DBHelper.getSessionFactory().openSession();
    };

    @Override
    public void saveUser(User user) {
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateUser(User user) {
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteUser(User user) {
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public User getUserById(long id) {
        return session.get(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) session.createQuery("FROM User").list();
    }
}