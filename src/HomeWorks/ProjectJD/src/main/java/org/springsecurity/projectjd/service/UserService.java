package org.springsecurity.projectjd.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springsecurity.projectjd.entity.User;
import org.springsecurity.projectjd.repository.EmpRepo;


@Service
public class UserService implements IUserService {

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);
        User newUser = empRepo.save(user);
        return newUser;
    }
}
