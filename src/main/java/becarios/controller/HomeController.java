package becarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(method={RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, headers = "Accept=application/json")
	public String redirect(){
		return "home";
	}
	
	@RequestMapping(value="index", method= RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="page2", method=RequestMethod.GET)
	public String goToPage2(){
		return "page2";
	}
}
