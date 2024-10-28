package org.hibernate_MTM.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "db2")
public class User2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "user2List", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private List<User1> user1List;

    public User2() {}

    public User2(String name) {
        this.name = name;
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

    public List<User1> getUser1List() {
        return user1List;
    }

    public void setUser1List(List<User1> user1List) {
        this.user1List = user1List;
    }

    public void addUser1(User1 user1){
        if (user1List == null) {
            user1List = new ArrayList<>();
        }
        user1List.add(user1);
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user1List=" + user1List +
                '}';
    }
}