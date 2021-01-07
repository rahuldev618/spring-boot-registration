package com.registration.service;

import com.registration.DAO.UserRegistrationDTO;
import com.registration.models.RegistrationDetailsModel;

public interface UserRegistrationService {
	
	public UserRegistrationDTO CreateUser(RegistrationDetailsModel reg);

}
