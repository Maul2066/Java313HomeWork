package org.hibernate_MTM.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "db1")
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "db3",
            joinColumns = @JoinColumn(name = "id_0001"),
            inverseJoinColumns = @JoinColumn(name = "id_0001_0001")
    )
    private List<User2> user2List;


    public User1() {}

    public User1(String name, String age, String email, String pass) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.pass = pass;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<User2> getUser2List() {
        return user2List;
    }

    public void setUser2List(List<User2> user2List) {
        this.user2List = user2List;
    }

    public void addUser2(User2 user2) {
        if (user2List == null) {
            user2List = new ArrayList<>();
        }
        user2List.add(user2);
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", user2List=" + user2List +
                '}';
    }
}