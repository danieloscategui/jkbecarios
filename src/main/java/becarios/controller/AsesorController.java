package becarios.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import becarios.controller.dto.AsesorDTO;
import becarios.model.Asesor;
import becarios.service.AsesorService;

@Controller
public class AsesorController {
	
	@Autowired
	private AsesorService asesorService;
	
	public void setAsesorService(AsesorService asesorService){
		this.asesorService = asesorService;
	}
	
	@RequestMapping(value="/asesores", method={RequestMethod.GET} )
	public ModelAndView goToAsesorPage(){
		
		List<Asesor> asesores = asesorService.listar();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("listaAsesores", asesores);
	
		return new ModelAndView("asesor", model);

	}
	
	@RequestMapping(value="/asesor/editar/{id}", method=RequestMethod.GET)
	public @ResponseBody AsesorDTO editarAsesor(@PathVariable("id") Long id){
		//get id asesor, search, and get back 
		//check if id = 0 then send new Asesor object else lookup by id an return it
		AsesorDTO asesorDTO = new AsesorDTO();
		if (id == 0){
			asesorDTO.setId(new Long(0));
		} else {
			Asesor asesor = asesorService.obtenerPorId(id);
			asesorDTO.setId(asesor.getIdAsesor());
			asesorDTO.setNombre(asesor.getNombre());
		}
		
		return asesorDTO;
	}
	
	@RequestMapping(value="/asesor/update", method={RequestMethod.POST})
	public void updateAsesor(ModelAndView model, AsesorDTO asesorDTO){
		//get data , validate and save it
		Asesor asesor = new Asesor();
		asesor.setIdAsesor(asesorDTO.getId());
		asesor.setNombre(asesorDTO.getNombre());
		asesorService.actualizar(asesor);
		goToAsesorPage();
		
		//http://www.mkyong.com/spring-mvc/spring-mvc-form-handling-example/
	}
	
}
