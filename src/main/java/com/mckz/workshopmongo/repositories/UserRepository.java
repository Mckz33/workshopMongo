package com.mckz.workshopmongo.repositories;

import com.mckz.workshopmongo.models.UserModel;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
}
