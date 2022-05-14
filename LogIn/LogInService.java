package com.LogIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LogInService {
	@Autowired
	private LogInRepository loginrepo;
	
	public String logIn (User givenuser )  {
		User user = loginrepo.findByEmail(givenuser.getEmail());
		String result = null;
		if (user == null)
			result="user not found";
		else   if (user.getEmail().equals (givenuser.getEmail())&& user.getPassword().equals( givenuser.getPassword())) {
			result= "user is found";
	        }
		  else  if( user.getPassword().equals(givenuser.getPassword()) == false  )
		  {
			  result= "password is incorrect" ;
		  }
		return result;

}
}
