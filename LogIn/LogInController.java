package com.LogIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

@RestController
public class LogInController {
	@Autowired
	private LogInService LogInService;
	@Autowired
	private LogInRepository lr;
	
	@PostMapping("/LogIn")
	public String LogIn(@RequestBody User user)  {
		return LogInService.logIn(user);
		
	}
	
	
}
