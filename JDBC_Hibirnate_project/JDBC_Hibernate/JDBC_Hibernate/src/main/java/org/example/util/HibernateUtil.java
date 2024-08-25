package org.example.util;

import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.addAnnotatedClass(User.class);

                configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
                configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
                configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/mysql");
                configuration.setProperty("hibernate.connection.username", "root");
                configuration.setProperty("hibernate.connection.password", "root");
                configuration.setProperty("hibernate.hbm2ddl.auto", "none");
                configuration.setProperty("hibernate.show_sql", "true");


                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                throw new RuntimeException("Ошибка при выполнении SessionFactory",e);
            }
        }
        return sessionFactory;
    }
}
