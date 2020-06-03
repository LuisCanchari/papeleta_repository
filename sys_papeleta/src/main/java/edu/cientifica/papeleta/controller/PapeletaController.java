package edu.cientifica.papeleta.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.cientifica.papeleta.model.Area;
import edu.cientifica.papeleta.service.AreaService;
import edu.cientifica.papeleta.service.EmpleadoService;

@Controller
public class PapeletaController {
	
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
		
	@RequestMapping(value = {"/papeleta/nuevo"}, method = RequestMethod.GET)
	public String papleta_nueva(Model model) {
		List<Area> listadoAreas =  new ArrayList<Area>();
		listadoAreas =  areaService.listarAreas();
		
		model.addAttribute("listadoAreas", listadoAreas);
		
		LOG.info(listadoAreas);
		
		
		return "papeleta_new";
	}

}


