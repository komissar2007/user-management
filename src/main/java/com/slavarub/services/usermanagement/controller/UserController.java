package com.slavarub.services.usermanagement.controller;

import com.slavarub.services.usermanagement.datatypes.User;
import com.slavarub.services.usermanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> AddUser(@RequestBody User user) {

        return new ResponseEntity<String>(userService.create(user), HttpStatus.OK);
    }

    @GetMapping(value = "/delete{id}")
    @ResponseBody
    public ResponseEntity<String> DeleteUser(@RequestParam String id) {
        userService.delete(id);
        return new ResponseEntity<String>(id, HttpStatus.OK);
    }

    @PostMapping(value = "/modify", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<User> modifyUser(@RequestBody User user) {
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/allUsers", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<User>> getAllUsers()
    {

        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/user{id}")
    @ResponseBody
    public ResponseEntity<User> getUser(@RequestParam String id)
    {
        return new ResponseEntity<User> (userService.getUserById(id), HttpStatus.OK);
    }
}
