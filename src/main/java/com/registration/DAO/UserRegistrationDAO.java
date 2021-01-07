package com.registration.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRegistrationDAO extends MongoRepository<UserRegistrationDTO, String>{

}
