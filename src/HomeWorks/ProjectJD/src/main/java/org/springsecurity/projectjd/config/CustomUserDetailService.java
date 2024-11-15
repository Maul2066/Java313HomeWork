package org.springsecurity.projectjd.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springsecurity.projectjd.entity.User;
import org.springsecurity.projectjd.repository.EmpRepo;

@Component
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = empRepo.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("User email not found");
        } else {
            return new CustomUser(user);
        }
    }
}