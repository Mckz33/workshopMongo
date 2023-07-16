package com.mckz.workshopmongo.controllers;

import com.mckz.workshopmongo.models.UserModel;
import com.mckz.workshopmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll(){
        List<UserModel> list = userServices.findAll();
        return ResponseEntity.ok().body(list);
    }

}
