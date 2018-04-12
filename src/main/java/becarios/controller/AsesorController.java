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

import becarios.controller.dto.AsesorDTO;
import becarios.service.AsesorService;

@Controller
public class AsesorController {
	
	@Autowired
	private AsesorService asesorService;
	
	/**
	 * List Asesor
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/asesor", method=RequestMethod.GET )
	public String showAllAsesor(Model model){
		model.addAttribute("asesorList", asesorService.showAll());
		return "asesor.list";

	}
	
	/**
	 * Save or update Asesor
	 * @param asesorDTO
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/asesor", method=RequestMethod.POST)
	public String saveOrUpdateAsesor(@ModelAttribute("asesorForm") AsesorDTO asesorDTO, BindingResult result, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return "asesor.form";
		} else {
			asesorService.saveOrUpdate(asesorDTO);
		}
		return "redirect:/asesor/";
	}
	
	/**
	 * Show Add Asesor Form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/asesor/add", method=RequestMethod.GET)
	public String showAddAsesorForm(Model model){
		AsesorDTO asesorDTO = new AsesorDTO();
		model.addAttribute("asesorForm", asesorDTO);
		return "asesor.form";
	}
	
	/**
	 * Show Update Asesor Form
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/asesor/{id}/update", method=RequestMethod.GET)
	public String showUpdateAsesorForm(@PathVariable("id") Long id, Model model){
		AsesorDTO asesorDTO = asesorService.getById(id);
		model.addAttribute("asesorForm", asesorDTO);
//		populateDefaultModel(model);
		return "asesor.form";
	}
	
	/**
	 * Populate Default Model
	 * https://howtoprogramwithjava.com/how-to-fix-duplicate-data-from-hibernate-queries/
	 */
	private void populateDefaultModel(){
		
	}
}
