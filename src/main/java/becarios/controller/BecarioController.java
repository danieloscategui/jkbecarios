package becarios.controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import becarios.model.Beca;
import becarios.model.Becario;
import becarios.model.BecarioEstado;
import becarios.model.Sexo;
import becarios.service.BecaService;
import becarios.service.BecarioService;

@Controller
public class BecarioController {
	
	private static final String BECARIO_LIST = "becario.list";
	private static final String BECARIO_FORM = "becario.form";
	private static final String BECARIO_SHOW = "becario.show";
	private static final String BECARIO_FORM_ESTADO = "becario.form.estado";
	
	@Autowired
	private BecarioService becarioService;
	
	@Autowired
	private BecaService becaService;
	
	private List<Beca> listaBecas = new ArrayList<Beca>();
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
		binder.registerCustomEditor(Beca.class, new PropertyEditorSupport(){
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				Beca beca = becaService.getById(Long.parseLong(text));
				setValue(beca);
			}
		});
	}
	
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
	public String saveOrUpdateBecario(@ModelAttribute("becarioForm") Becario becario, BindingResult result, Model model, final RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			populateDefaultModel(model);
			return BECARIO_FORM;
		} else {
			becarioService.saveOrUpdate(becario);
		}
		return "redirect:/becario/beca/"+ String.valueOf(becario.getBeca().getIdBeca());
	}
	
	
	/**
	 * Formulario Cambiar Estado 
	 */
	@RequestMapping(value="/becario/{idBecario}/updateEstado", method=RequestMethod.GET)
	public String updateBecarioEstadoForm(@PathVariable("idBecario") Long idBecario, Model model){
		model.addAttribute("becarioForm", becarioService.getById(idBecario));
		populateDefaultModel(model);
		return BECARIO_FORM_ESTADO;
	}
	
	/**
	 * Formulario Actualizar Becario
	 */
	@RequestMapping(value="/becario/{idBecario}/update",method=RequestMethod.GET)
	public String showUpdateBecarioForm(@PathVariable("idBecario") Long idBecario, Model model){
		Becario becario = becarioService.getById(idBecario);
		model.addAttribute("becarioForm", becario);
		populateDefaultModel(model);
		return BECARIO_FORM;
	}
	
	/**
	 * Metodo Actualizar Estado
	 */
	@RequestMapping(value="/becario/updateEstado", method=RequestMethod.POST)
	public String updateBecarioEstado(@ModelAttribute("becarioForm") Becario becario){
		becarioService.updateBecarioEstado(becario.getIdBecario(), becario.getEstadoActual());
		return "redirect:/becario/beca/" + String.valueOf(becario.getBeca().getIdBeca());
	}
	
	/**
	 * Show Add Becario Form
	 */
	@RequestMapping(value="/becario/add", method=RequestMethod.GET)
	public String showAddBecarioForm(Model model){
		Becario becario = new Becario();
		model.addAttribute("becarioForm", becario);
		populateDefaultModel(model);
		return BECARIO_FORM;
	}
	
	/**
	 * Show Becario 
	 */
	@RequestMapping(value="/becario/show/{dni}", method=RequestMethod.GET)
	public String showBecario(@PathVariable("dni") String dni, Model model){
		if (dni.isEmpty() || dni == null){
			model.addAttribute("msg", "Ingrese DNI");
			return "redirect:/";
		}
		
		Becario becario = becarioService.getByDNI(dni);
		if(becario == null){
			model.addAttribute("msg", "No existe DNI");
			return "redirect:/";
		}
		model.addAttribute("becario", becario);
		return BECARIO_SHOW;
	}
	
	@RequestMapping(value="/becario/returnBeca", method=RequestMethod.GET)
	public String returnBeca(Model model){
		return "redirect:/";
	}
	
	
	/**
	 * Populate Default Model
	 */
	protected final void populateDefaultModel(Model model){
		
		if (listaBecas.isEmpty()){
			listaBecas = becaService.showAll();
		}

		model.addAttribute("listaBecas", listaBecas);
		model.addAttribute("becarioEstado", BecarioEstado.values());
		model.addAttribute("becarioSexo", Sexo.values());
		
	}
}
