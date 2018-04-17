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

import becarios.controller.dto.BecaDTO;
import becarios.model.Beca;
import becarios.service.BecaService;

@Controller
public class BecaController {
	
	private static final String BECA_LIST = "beca.list";
	private static final String BECA_FORM = "beca.form";
	private static final String BECA_REDIRECT = "redirect:/beca/";
	
	@Autowired
	private BecaService becaService;
	
	/**
	 * Show All Becas
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/beca", method=RequestMethod.GET)
	public String showAllBecas(Model model){
		model.addAttribute("becaList", becaService.showAll());
		return BECA_LIST;
	}
	
	/**
	 * Save or update Beca
	 * @param becaDTO
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/beca", method=RequestMethod.POST)
	public String saveorUpdateBeca(@ModelAttribute("becaForm") Beca beca, BindingResult result, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return BECA_FORM;
		} else {
			becaService.saveOrUpdate(beca);
		}
		return BECA_REDIRECT;
	}
	
	/**
	 * Show Add Beca Form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/beca/add", method=RequestMethod.GET)
	public String showAddBecaForm(Model model){
		Beca beca = new Beca();
		model.addAttribute("becaForm", beca);
		return BECA_FORM;
	}
	
	/**
	 * Show Update Beca Form
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/beca/{id}/update", method=RequestMethod.GET)
	public String showUpdateBecaForm(@PathVariable("id") Long id, Model model){
		Beca beca = becaService.getById(id);
		model.addAttribute("becaForm", beca);
		return BECA_FORM;
	}
	
	/**
	 * Populate Default Model
	 * @param model
	 */
	private void populateDefaultModel(Model model){
		
	}
}
