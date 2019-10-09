package com.slavarub.services.usermanagement.datatypes;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
public class User {
    private String id;
    private String name;
    private String lastName;
    private String userName;
    private String email;
    private String password;

}
