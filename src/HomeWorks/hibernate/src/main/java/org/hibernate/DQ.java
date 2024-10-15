package org.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.entity.User;

public class DQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete from User where Name2 = 'Игорь'").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
