package becarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import becarios.model.Tramite;
import becarios.service.TramiteService;

@Controller
public class TramiteController {
	
	private static final String TRAMITE_LIST = "tramite.list";
	private static final String TRAMITE_FORM = "tramite.form";
	private static final String TRAMITE_REDIRECT = "redirect:/tramite/";
	
	@Autowired
	private TramiteService  tramiteService;
	
	@RequestMapping(value="/tramite", method=RequestMethod.GET)
	public String showAllTramites(Model model){
		model.addAttribute("tramiteList", tramiteService.showAll());
		return TRAMITE_LIST;
	}
	
	@RequestMapping(value="/tramite", method=RequestMethod.POST)
	public String saveOrUpdateTramite(@ModelAttribute("tramiteForm") Tramite tramite, BindingResult result, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return TRAMITE_FORM;
		} else {
			tramiteService.saveOrUpdate(tramite);
		}
		return TRAMITE_REDIRECT;
	}
	
	@RequestMapping(value="/tramite/add", method=RequestMethod.GET)
	public String showAddTramiteForm(Model model){
		Tramite tramite = new Tramite();
		model.addAttribute("tramiteForm", tramite);
		return TRAMITE_FORM;
	}
	
	@RequestMapping(value="/tramite/{id}/update", method=RequestMethod.GET)
	public String showUpdateTramiteForm(@PathVariable("id") Long id, Model model){
		Tramite tramite = tramiteService.getById(id);
		model.addAttribute("tramiteForm", tramite);
		return TRAMITE_FORM;
	}
	
	private void populateDefaultModel(Model model){
		
	}
	
}
