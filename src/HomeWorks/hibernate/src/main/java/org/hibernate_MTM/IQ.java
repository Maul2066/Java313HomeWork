package org.hibernate_MTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_MTM.entity.User1;
import org.hibernate_MTM.entity.User2;

public class IQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User1.class).addAnnotatedClass(User2.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            User2 user2 = new User2("User2 Name");
            User1 user1_1 = new User1("User1 Name 1", "35 years", "user1_1@gmail.com", "password1");
            User1 user1_2 = new User1("User1 Name 2", "20 years", "user1_2@gmail.com", "password2");
            User1 user1_3 = new User1("User1 Name 3", "30 years", "user1_3@gmail.com", "password3");

            user2.addUser1(user1_1);
            user2.addUser1(user1_2);
            user2.addUser1(user1_3);
            session.beginTransaction();
            session.persist(user1_1);
            session.persist(user1_2);
            session.persist(user1_3);
            session.persist(user2);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}