package org.hibernate_OTM;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_OTM.entity.User;
import org.hibernate_OTM.entity.User1;

public class DQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(User1.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete from User1 where id = 1").executeUpdate();

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
