package com.slavarub.services.usermanagement.db.repositories;

import com.slavarub.services.usermanagement.db.UserDM;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDM, String> {

    UserDM findById(ObjectId id);
}
