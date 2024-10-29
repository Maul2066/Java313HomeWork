package org.spring.mvc.User.service;

import org.spring.mvc.User.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
