package org.hibernate;

import org.hibernate.entity.User;
import org.hibernate.cfg.Configuration;

public class IQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            User user = new User("Некифоров", "Игорь", "Вячеславович", 5, "igorIM@gmail.com", "1N32uhw213hUhbcYf");
            session.beginTransaction();
            session.persist(user);
            System.out.println(user);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}