//package org.hibernate_OTM.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "dbP")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id1")
//    private int id1;
//    @Column(name = "Name1")
//    private String Name1;
//    @Column(name = "Name2")
//    private String Name2;
//    @Column(name = "Name3")
//    private String Name3;
//    @Column(name = "age")
//    private int age;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "password")
//    private String password;
//
//    public User(String name1, String name2, String name3, int age, String email, String password) {
//        Name1 = name1;
//        Name2 = name2;
//        Name3 = name3;
//        this.age = age;
//        this.email = email;
//        this.password = password;
//    }
//
//
//    @ManyToOne(cascade = {
//            CascadeType.PERSIST,
//            CascadeType.DETACH,
//            CascadeType.REFRESH,
//            CascadeType.MERGE})
//    @JoinColumn(name = "User1_id")
//
//    private  User1 user;
//
//    public User() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id1=" + id1 +
//                ", Name1='" + Name1 + '\'' +
//                ", Name2='" + Name2 + '\'' +
//                ", Name3='" + Name3 + '\'' +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//
//    public int getId1() {
//        return id1;
//    }
//
//    public void setId1(int id1) {
//        this.id1 = id1;
//    }
//
//    public String getName1() {
//        return Name1;
//    }
//
//    public void setName1(String name1) {
//        Name1 = name1;
//    }
//
//    public String getName2() {
//        return Name2;
//    }
//
//    public void setName2(String name2) {
//        Name2 = name2;
//    }
//
//    public String getName3() {
//        return Name3;
//    }
//
//    public void setName3(String name3) {
//        Name3 = name3;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public User1 getUser1() {
//        return user;
//    }
//
//    public void setUser1(User1 user) {
//        this.user = user;
//    }
//}
