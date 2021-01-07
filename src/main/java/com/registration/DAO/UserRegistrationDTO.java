package com.registration.DAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDTO {
	
	
	//public UserRegistrationDTO(String firstName, String lastName, String dob, String emailId) {
		// TODO Auto-generated constructor stub
	//}
	public String firstName;
	public String lastName;
	public String emailId;
	public String dob;
	//public String role;
	//public String manager;
	
	

}
