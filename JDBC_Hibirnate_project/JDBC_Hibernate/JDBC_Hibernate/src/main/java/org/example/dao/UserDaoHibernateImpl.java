package org.example.dao;

import org.example.model.User;
<<<<<<< HEAD
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;
=======
>>>>>>> origin/main

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
<<<<<<< HEAD
        String hql = "CREATE TABLE IF NOT EXISTS user (id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50), lastName VARCHAR(50), age TINYINT)";
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.createSQLQuery(hql).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
=======

>>>>>>> origin/main
    }

    @Override
    public void dropUsersTable() {
<<<<<<< HEAD
        String hql = "DROP TABLE IF EXISTS user";
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.createSQLQuery(hql).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
=======

>>>>>>> origin/main
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
<<<<<<< HEAD
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = new User(name, lastName, age);
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
=======

>>>>>>> origin/main
    }

    @Override
    public void removeUserById(long id) {
<<<<<<< HEAD
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
=======

>>>>>>> origin/main
    }

    @Override
    public List<User> getAllUsers() {
<<<<<<< HEAD
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM user");
            return query.list();
        }
    }

        @Override
        public void cleanUsersTable () {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.createQuery("DELETE FROM user").executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            }
        }
    }
=======
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
>>>>>>> origin/main
