//package org.hibernate;
//
//import org.hibernate.entity.User;
//
//public class SQ {
//    public static void main(String[] args) {
//        SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
//        try{
//            Session session = factory.getCurrentSession();
//            User user = new User("Некифоров", "Игорь", "Вячеславович", 5, "igorIM@gmail.com", "1N32uhw213hUhbcYf");
//            session.beginTransaction();
//            session.getTransaction().commit();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.getTransaction().commit();
//            System.out.println(user);
//        } finally {
//            factory.close();
//        }
//    }
//}
