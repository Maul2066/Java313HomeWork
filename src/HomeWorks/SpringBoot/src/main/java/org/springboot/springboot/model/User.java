package org.springboot.springboot.model;

public class User {
    private String name;
    private String email;
    private String pass;
    private String Role;

    public User(String name, String email, String pass, String role) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        Role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}