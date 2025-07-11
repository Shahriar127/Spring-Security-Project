package com.shahriar.Spring.Security.Project.service;

import com.shahriar.Spring.Security.Project.model.UserPrincipal;
import com.shahriar.Spring.Security.Project.dao.UserRepo;
import com.shahriar.Spring.Security.Project.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService {
    private UserRepo repo;

    public UserDetails loadUserByUsername(String username){
        User user = repo.findByUsername(username);

        if(user == null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }
}
