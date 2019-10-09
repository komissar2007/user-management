package com.slavarub.services.usermanagement.services;

import com.slavarub.services.usermanagement.datatypes.User;
import com.slavarub.services.usermanagement.db.UserDM;
import com.slavarub.services.usermanagement.db.mappers.MapUserDMToUser;
import com.slavarub.services.usermanagement.db.mappers.MapUserToUserDM;
import com.slavarub.services.usermanagement.db.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MapUserToUserDM mapUserToUserDM;
    @Autowired
    MapUserDMToUser mapUserDMToUser;


    public String create(User user) {
        UserDM response = userRepository.insert(mapUserToUserDM.map(user));
        return response.getId();

    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {

        List<UserDM> userDMList = userRepository.findAll();

        return mapUserDMToUser.map(userDMList);
    }

    public User getUserById(String id)
    {
        Optional<UserDM> userDM = userRepository.findById(id);
        return mapUserDMToUser.map(userDM.get());
    }
}