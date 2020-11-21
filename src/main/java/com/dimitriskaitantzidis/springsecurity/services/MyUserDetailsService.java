package com.dimitriskaitantzidis.springsecurity.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    // Here the user for the authentication is retrieved based on some property, either username, id etc and is returned
    // if not returned the configurer throws the exception
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load the User for db here
        return new User("foo", "foo", new ArrayList<>());
    }
}
