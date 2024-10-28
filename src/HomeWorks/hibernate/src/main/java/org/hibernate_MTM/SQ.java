package org.hibernate_MTM;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_MTM.entity.User1;
import org.hibernate_MTM.entity.User2;

public class SQ {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User1.class).addAnnotatedClass(User2.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            User2 user2 = session.get(User2.class, 1);
            System.out.println(user2);
            System.out.println(user2.getUser1List());
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