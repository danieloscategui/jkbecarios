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

import becarios.controller.dto.PagoAcademicoDTO;
import becarios.model.PagoAcademico;
import becarios.service.PagoAcademicoService;

@Controller
public class PagoAcademicoController {
	
	private static final String PAGO_ACADEMICO_LIST = "pagoAcademico.list";
	private static final String PAGO_ACADEMICO_FORM = "pagoAcademico.form";
	private static final String PAGO_ACADEMICO_REDIRECT = "redirect:/pagoAcademico/";
	
	@Autowired
	private PagoAcademicoService pagoAcademicoService;
	
	@RequestMapping(value="/pagoAcademico", method=RequestMethod.GET)
	public String showAllPagoAcademicos(Model model){
		model.addAttribute("pagoAcademicoList", pagoAcademicoService.showAll());
		return PAGO_ACADEMICO_LIST;
	}
	
	@RequestMapping(value="/pagoAcademico", method=RequestMethod.POST)
	public String saveOrUpdatePagoAcademico(@ModelAttribute("pagoAcademicoForm") PagoAcademico pagoAcademico, BindingResult result, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return PAGO_ACADEMICO_FORM;
		} else {
			pagoAcademicoService.saveOrUpdate(pagoAcademico);
		}
		return PAGO_ACADEMICO_REDIRECT;
	}
	
	@RequestMapping(value="/pagoAcademico/add", method=RequestMethod.GET)
	public String showAddPagoAcademicoForm(Model model){
		PagoAcademico pagoAcademico = new PagoAcademico();
		model.addAttribute("pagoAcademicoForm", pagoAcademico);
		return PAGO_ACADEMICO_FORM;
	}
	
	@RequestMapping(value="/pagoAcademico/{id}/update", method=RequestMethod.GET)
	public String showUpdatePagoAcademico(@PathVariable("id") Long id, Model model){
		PagoAcademico pagoAcademico = pagoAcademicoService.getById(id);
		model.addAttribute("pagoAcademicoForm", pagoAcademico);
		return PAGO_ACADEMICO_FORM;
	}
	
	private void populateDefaultModel(Model model){
		
	}
	
}
