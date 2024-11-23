package org.springsecurity.projectjd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springsecurity.projectjd.entity.User;
import org.springsecurity.projectjd.entity.UserComm;


public interface EmpRepo extends JpaRepository<User, Integer> {
    public User findByEmail(String email);
}