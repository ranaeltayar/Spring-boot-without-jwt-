package com.LogIn;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInRepository extends MongoRepository<User, String>{
	User findByEmail  (String email);

}
