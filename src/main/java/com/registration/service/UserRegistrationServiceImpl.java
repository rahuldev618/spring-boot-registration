package com.registration.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.DAO.UserRegistrationDAO;
import com.registration.DAO.UserRegistrationDTO;
import com.registration.models.RegistrationDetailsModel;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDAO userDao;

	@Override
	public UserRegistrationDTO CreateUser(RegistrationDetailsModel reg) {
		// TODO Auto-generated method stub
		Random randomNum = new Random();
		 int randApp = randomNum.nextInt(1000000);
		 System.out.println(randApp);
		 //ModelMapper
		userDao.save(new UserRegistrationDTO(reg.getFirstName(),reg.getLastName(),reg.getEmailId(),reg.getDob()));
		return null;
	}
}
