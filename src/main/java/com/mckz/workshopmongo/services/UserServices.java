package com.mckz.workshopmongo.services;

import com.mckz.workshopmongo.models.UserModel;
import com.mckz.workshopmongo.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> findAll(){
        return userRepository.findAll();
    }
}
