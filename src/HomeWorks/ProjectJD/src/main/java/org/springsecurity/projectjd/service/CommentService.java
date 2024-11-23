package org.springsecurity.projectjd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springsecurity.projectjd.entity.Comm;
import org.springsecurity.projectjd.repository.CommRepo;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommRepo commentRepository;

    public List<Comm> getAllComments() {
        return commentRepository.findAll(); // Возвращает все комментарии
    }
}
