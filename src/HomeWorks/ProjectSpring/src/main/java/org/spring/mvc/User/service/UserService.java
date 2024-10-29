package org.spring.mvc.User.service;

import jakarta.transaction.Transactional;
import org.spring.mvc.User.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public List<User> findAll() {
        return (List<User>) UserRepository.findAll();
    }

    public void save(User user) {
        UserRepository.save(user);
    }

    public User getUserById(long UserId) {
        User empDB = UserRepository.findById(UserId).get();
        return empDB;
    }

    public User update(User employee, Long UserId) {
        User empDB = UserRepository.findById(UserId).get();
        empDB.setName(employee.getName());
        empDB.setEmail(employee.getEmail());
        empDB.setPass(employee.getPass());
        return UserRepository.save(empDB);
    }

    public void deleteUserById(long UserId) {
        UserRepository.deleteById(UserId);
    }
}
