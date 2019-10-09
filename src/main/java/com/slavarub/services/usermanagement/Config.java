package com.slavarub.services.usermanagement;

import com.slavarub.services.usermanagement.datatypes.User;
import com.slavarub.services.usermanagement.db.UserDM;
import com.slavarub.services.usermanagement.db.mappers.MapUserDMToUser;
import com.slavarub.services.usermanagement.db.mappers.MapUserToUserDM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    protected User user() {
        return new User();
    }

/*    @Bean
    protected UserService addUserService() {
        return new UserService();
    }*/

    @Bean
    @Scope
    protected UserDM userDm() {
        return new UserDM();
    }

    @Bean
    protected MapUserToUserDM mapUserToUserDM() {
        return new MapUserToUserDM();
    }

    @Bean
    @Scope
    protected MapUserDMToUser mapUserDMToUser() {
        return new MapUserDMToUser();
    }

}
