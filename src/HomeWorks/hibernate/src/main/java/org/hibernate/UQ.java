//package org.hibernate;
//
//import org.hibernate.cfg.Configuration;
//import org.hibernate.entity.User;
//
//public class UQ {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
//        try{
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            session.createQuery("update User set Name2 = 'Дмитрий' where Name2 = 'Александр'").executeUpdate();
//
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//        }
//    }
//}