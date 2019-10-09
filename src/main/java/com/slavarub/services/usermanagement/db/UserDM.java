package com.slavarub.services.usermanagement.db;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserDM {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String userName;
    private String email;
    private String password;


}
