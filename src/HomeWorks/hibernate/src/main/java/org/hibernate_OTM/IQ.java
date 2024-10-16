package org.hibernate_OTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_OTM.entity.User;
import org.hibernate_OTM.entity.User1;

public class IQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(User1.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            User user = new User("name0000", "name0000", "name3", 30, "Person0000@gmail.com", "haG2hbH3Bjd2");
            User1 user1 = new User1("name0001", "name0001", "name0001", 30, "Person0001@gmail.com", "ShaGd3hsbH3gdswBjd2");

            user1.addUserToUser1(user);
            session.beginTransaction();
            session.persist(user1);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}