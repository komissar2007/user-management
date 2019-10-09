package com.slavarub.services.usermanagement.db.mappers;

import com.slavarub.services.usermanagement.datatypes.User;
import com.slavarub.services.usermanagement.db.UserDM;
import org.springframework.beans.factory.annotation.Autowired;

public class MapUserToUserDM {

    @Autowired
    UserDM userDM;

    public UserDM map(User user)
    {
        userDM.setEmail(user.getEmail());
        userDM.setLastName(user.getLastName());
        userDM.setName(user.getName());
        userDM.setPassword(user.getPassword());
        userDM.setUserName(user.getUserName());

        return userDM;
    }
}
