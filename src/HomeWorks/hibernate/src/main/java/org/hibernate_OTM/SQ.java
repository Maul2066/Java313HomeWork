//package org.hibernate_OTM;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate_OTM.entity.User;
//import org.hibernate_OTM.entity.User1;
//
//public class SQ {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(User1.class).buildSessionFactory();
//
//        Session session = null;
//
//        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            User1 user1 = session.get(User1.class, 1);
//            System.out.println(user1);
//            System.out.println(user1.getUser());
//            session.getTransaction().commit();
//        } finally {
//            session.close();
//            factory.close();
//        }
//    }
//}