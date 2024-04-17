package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {

	
	//say-hello=> "hello! what are you learning today?"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "hello! what are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page1 - Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body-Changed");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
		
		
		//say-hello-jsp reuqest - handlong controller--SayHelloController -- method sayHelloJsp -- sayHello prefix suffix is .jsp
	}
}
