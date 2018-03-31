package becarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody String getPersonas(Model model){
		//List<Persona> personas = personaService.getPersonas();
		//model.addAttribute("persona", new Persona());
		//model.addAttribute("personas", personas);
		return "personaDetails";
	}
}
