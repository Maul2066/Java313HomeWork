package org.spring.mvc.DataAccessObject;

import org.spring.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        String sql = "INSERT INTO user(Name1, Name2, Name3, age, email, password) VALUES(?, ?, ?, ?, ?, ?)";
        int i = jdbcTemplate.update(sql, user.getName1(), user.getName2(), user.getName3(), user.getAge(), user.getEmail(), user.getPassword());
        return i;
    }
}