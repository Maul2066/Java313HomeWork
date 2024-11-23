package org.springsecurity.projectjd.service;

import org.springsecurity.projectjd.entity.UserComm;
import org.springsecurity.projectjd.repository.UserCommRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommService {
    @Autowired
    private UserCommRepository userCommRepository;

    public List<UserComm> getAllComments() {
        return userCommRepository.findAll();
    }

    public void saveComment(UserComm comment) {
        userCommRepository.save(comment);
    }
}