package org.example.service;

import org.example.dao.UserDao;
<<<<<<< HEAD
import org.example.dao.UserDaoHibernateImpl;
=======
>>>>>>> origin/main
import org.example.dao.UserDaoJDBCImpl;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
<<<<<<< HEAD
    private UserDao userDao = new UserDaoHibernateImpl();
=======
    private UserDao userDao = new UserDaoJDBCImpl();
>>>>>>> origin/main
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в БД");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        for (User user: users){
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
