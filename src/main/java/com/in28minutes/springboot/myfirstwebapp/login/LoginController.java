package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticationService; 
			

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String gotoLoginPage( ) {
	
		return "login";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST )
	//login? name =shu RequestParam
	public String gotowelcomePage(@RequestParam String name, @RequestParam String password ,
			ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
		
			model.put("name", name);
			//model.put("password", password);
			//authentication 
			//name - in28minuts
			//passowrd - dummy approve
			return "welcome";
		}
		model.put("errorMessage", "InvalidCredentials! please try again");
		
		return "login";
	}
}
//form is used to capture deatils form user 