package com.slavarub.services.usermanagement.db.mappers;

import com.slavarub.services.usermanagement.datatypes.User;
import com.slavarub.services.usermanagement.db.UserDM;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ProviderCreatingFactoryBean;

import javax.xml.ws.Provider;
import java.util.ArrayList;
import java.util.List;

public class MapUserDMToUser {
    @Autowired
    protected User user;

    @Autowired
    ObjectFactory<User> userObjectFactory ;

    public User map(UserDM userDM)
    {
        user.setEmail(userDM.getEmail());
        user.setId(userDM.getId());
        user.setLastName(userDM.getLastName());
        user.setName(userDM.getName());
        user.setUserName(userDM.getUserName());

        return user;
    }

    public List<User> map(List<UserDM> userDMList)
    {
        List<User> userList = new ArrayList<>();
        for (UserDM userDMItem:userDMList)
        {
            user = userObjectFactory.getObject();
            user.setId(userDMItem.getId());
            user.setEmail(userDMItem.getEmail());
            user.setLastName(userDMItem.getLastName());
            user.setName(userDMItem.getName());
            user.setUserName(userDMItem.getUserName());
            userList.add(user);
        }

        return userList;
    }
}
