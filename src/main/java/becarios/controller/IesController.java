package becarios.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import becarios.controller.dto.IesDTO;
import becarios.service.IesService;

@Controller
public class IesController {
	
	@Autowired
	private IesService iesService;
	
	/**
	 * List IES
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/ies", method=RequestMethod.GET)
	public String showAllIes(Model model){
		model.addAttribute("iesList", iesService.showAll());
		return  "ies.list"; 
	}
	
	/**
	 * Save or update IES
	 * @param iesDto
	 * @param result
	 * @param model
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/ies", method=RequestMethod.POST)
	public String saveOrUpdateIes(@ModelAttribute("iesForm") IesDTO iesDto, BindingResult result, Model model, final RedirectAttributes redirectAttributes){
		
		if (result.hasErrors()){
//			populateDefaultModel(model);
			return "ies.form";
		} else {
			
			// Add message to flash scope
			redirectAttributes.addFlashAttribute("css", "sucess");
			if (iesDto.isNew()){
				redirectAttributes.addFlashAttribute("msg", "IES added successfully");
			} else {
				redirectAttributes.addFlashAttribute("msg", "IES updated successufully");
			}
			
			iesService.saveOrUpdate(iesDto);
			
			return "redirect:/ies/"; //+ies.getId();
		}
	}

	
	/**
	 * Show Add IES Form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/ies/add", method=RequestMethod.GET)
	public String showAddIesForm(Model model){
		IesDTO iesDto = new IesDTO();
		//set default value
		model.addAttribute("iesForm", iesDto);
//		populateDefaultModel(model);
		return "ies.form";
	}
	
	/**
	 * Show Update IES Form
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/ies/{id}/update", method=RequestMethod.GET)
	public String showUpdateIesForm(@PathVariable("id") Long id,  Model model){
		IesDTO iesDto = iesService.getById(id);
		model.addAttribute("iesForm", iesDto);
//		populateDefaultModel(model);
		return "ies.form";
	}
	
	/**
	 * Delete IES -- to implement
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/ies/{id}/delete", method=RequestMethod.POST)
	public String deleteIes(@PathVariable("id") Long id, final RedirectAttributes redirectAttributes){
		//check previous data -- implements
//		iesService.delete(id);
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "IES has been deleted");
		return "redirect:/ies";
	}
	
	/**
	 * Show IES - to implement
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/ies/{id}", method=RequestMethod.GET)
	public String showIES(@PathVariable("id") Long id, Model model){
		IesDTO iesDto = iesService.getById(id);
		if (iesDto == null){
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "IES not found");
		} 
		model.addAttribute("ies", iesDto);
		
		return "ies.form";//make new ies.show just to show data
	}
	
	/**
	 * Populate Default Model
	 * @param model
	 */
	private void populateDefaultModel(Model model) {

		List<String> frameworksList = new ArrayList<String>();
		frameworksList.add("Spring MVC");
		frameworksList.add("Struts 2");
		frameworksList.add("JSF 2");
		frameworksList.add("GWT");
		frameworksList.add("Play");
		frameworksList.add("Apache Wicket");
		model.addAttribute("frameworkList", frameworksList);

		Map<String, String> skill = new LinkedHashMap<String, String>();
		skill.put("Hibernate", "Hibernate");
		skill.put("Spring", "Spring");
		skill.put("Struts", "Struts");
		skill.put("Groovy", "Groovy");
		skill.put("Grails", "Grails");
		model.addAttribute("javaSkillList", skill);

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		model.addAttribute("numberList", numbers);

		Map<String, String> country = new LinkedHashMap<String, String>();
		country.put("US", "United Stated");
		country.put("CN", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		model.addAttribute("countryList", country);

	}
}
