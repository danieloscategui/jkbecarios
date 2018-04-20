package becarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import becarios.model.Becario;
import becarios.model.BecarioEstado;
import becarios.service.BecaService;
import becarios.service.BecarioService;

@Controller
public class BecarioController {
	
	private static final String BECARIO_LIST = "becario.list";
	private static final String BECARIO_FORM = "becario.form";
	private static final String BECARIO_REDIRECT = "redirect:/becario/";
	private static final String BECARIO_FORM_ESTADO = "becario.form.estado";
	
	@Autowired
	private BecarioService becarioService;
	
	@Autowired
	private BecaService becaService;
	
	/**
	 * Show All Becarios
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/becario", method=RequestMethod.GET)
	public String showAllBecarios(Model model){
		model.addAttribute("becarioList", becarioService.showAll());
		return BECARIO_LIST;
	}

	/**
	 * Show Becarios por Beca
	 * @param idBeca
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/becario/beca/{idBeca}", method=RequestMethod.GET)
	public String showBecariosPorBeca(@PathVariable("idBeca") Long idBeca, Model model){
		model.addAttribute("becarioList", becarioService.showBecariosPorBeca(idBeca));
		model.addAttribute("beca", becaService.getById(idBeca));
		return BECARIO_LIST;
	}
	
	/**
	 * Save or Update Becario
	 * @param becarioDTO
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/becario", method=RequestMethod.POST)
	public String saveOrUpdateBecario(@ModelAttribute("becarioForm") Becario becario, BindingResult result, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return BECARIO_FORM;
		} else {
			becarioService.saveOrUpdate(becario);
		}
		return BECARIO_REDIRECT;
	}
	
	
	
	@RequestMapping(value="/becario/{dni}/updateEstado", method=RequestMethod.GET)
	public String updateBecarioEstadoForm(@PathVariable("dni")String dni, Model model){
		model.addAttribute("becarioForm", becarioService.getByDNI(dni));
		model.addAttribute("becarioEstado", BecarioEstado.values());
		return BECARIO_FORM_ESTADO;
	}
	
	@RequestMapping(value="/becario/updateEstado", method=RequestMethod.POST)
	public String updateBecarioEstado(@ModelAttribute("becarioForm") Becario becario){
		becarioService.updateBecarioEstado(becario.getDni(), becario.getEstadoActual());
		return "redirect:/becario/beca/" + String.valueOf(becario.getBeca().getIdBeca());
	}
	
	/**
	 * Show Add Becario Form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/becario/add", method=RequestMethod.GET)
	public String showAddBecarioForm(Model model){
		Becario becario = new Becario();
		model.addAttribute("becarioForm", becario);
		return BECARIO_FORM;
	}
	
	/**
	 * Show Update Becario Form
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/becario/{dni}/update",method=RequestMethod.GET)
	public String showUpdateBecarioForm(@PathVariable("dni") String DNI, Model model){
		Becario becario = becarioService.getByDNI(DNI);
		model.addAttribute("becarioForm", becario);
		return BECARIO_FORM;
	}
	
	
	/**
	 * Populate Default Model
	 */
	private void populateDefaultModel(){
		
	}
}
