package becarios.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.servlet.ModelAndView;

import becarios.controller.reports.ExcelBecasReportView;
import becarios.model.Beca;
import becarios.model.VistaBecas;
import becarios.service.AsesorService;
import becarios.service.BecaService;
import becarios.service.IesService;

@Controller
public class BecaController {

	private static final String BECA_LIST = "beca.list";
	private static final String BECA_FORM = "beca.form";
	private static final String BECA_REDIRECT = "redirect:/beca/";

	@Autowired
	private BecaService becaService;

	@Autowired
	private IesService iesService;

	@Autowired
	private AsesorService asesorService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	/**
	 * Show All Becas
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/beca", method = RequestMethod.GET)
	public String showAllBecas(Model model) {
		model.addAttribute("becaList", becaService.showAll());
		return BECA_LIST;
	}

	/**
	 * Save or update Beca
	 * 
	 * @param becaDTO
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/beca", method = RequestMethod.POST)
	public String saveorUpdateBeca(@ModelAttribute("becaForm") Beca beca, BindingResult result, Model model) {
		if (result.hasErrors()) {
			populateDefaultModel(model);
			return BECA_FORM;
		} else {
			becaService.saveOrUpdate(beca);
		}
		return BECA_REDIRECT;
	}

	/**
	 * Show Add Beca Form
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/beca/add", method = RequestMethod.GET)
	public String showAddBecaForm(Model model) {
		Beca beca = new Beca();
		model.addAttribute("becaForm", beca);
		populateDefaultModel(model);
		return BECA_FORM;
	}

	/**
	 * Show Update Beca Form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/beca/{id}/update", method = RequestMethod.GET)
	public String showUpdateBecaForm(@PathVariable("id") Long id, Model model) {
		Beca beca = becaService.getById(id);
		model.addAttribute("becaForm", beca);
		populateDefaultModel(model);
		return BECA_FORM;
	}

	@RequestMapping(value = "/beca/reporteExcel", method = RequestMethod.GET, produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
	public ModelAndView becaReporteExcel(HttpServletRequest request, HttpServletResponse response) {
		// String typeReport = request.getParameter("type");

		List<VistaBecas> becasList = becaService.getVistaBecas();

		return new ModelAndView(new ExcelBecasReportView(), "becasList", becasList);

	}

	/**
	 * Populate Default Model
	 * 
	 * @param model
	 */
	private void populateDefaultModel(Model model) {
		model.addAttribute("listaIes", iesService.showAll());
		model.addAttribute("listaAsesores", asesorService.showAll());
	}
}
