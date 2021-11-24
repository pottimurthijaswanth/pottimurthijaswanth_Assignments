package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	@RequestMapping("/hello")
	public String home()
	{
		System.out.println("this is home url");
		return "hibroo";
	}
	
	
	
}
