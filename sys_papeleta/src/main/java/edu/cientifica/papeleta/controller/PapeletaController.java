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
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.papeleta.model.Area;
import edu.cientifica.papeleta.model.Empleado;
import edu.cientifica.papeleta.model.Papeleta;
import edu.cientifica.papeleta.service.AreaService;
import edu.cientifica.papeleta.service.EmpleadoService;
import edu.cientifica.papeleta.service.PapeletaService;

@Controller
public class PapeletaController {
	
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private PapeletaService papeletaService;
	
		
	@RequestMapping(value = {"/papeleta/nuevo"}, method = RequestMethod.GET)
	public String papletaNew(Model model) {
		
		List<Area> listadoAreas =  new ArrayList<Area>();
		listadoAreas =  areaService.listarAreas();
		
		List<Empleado> listadoEmpleados =  new ArrayList<Empleado>();
		listadoEmpleados=  empleadoService.listarEmpleados();
		
				
		model.addAttribute("listadoAreas", listadoAreas);
		model.addAttribute("listadoEmpleados", listadoEmpleados);
		
		
		
		LOG.info("proceso el metodo papeleta_nueva");
		return "papeleta_new";
	}
	
	@RequestMapping(value = {"/papeleta/registro"}, method = RequestMethod.POST)
	public String papeletaSave(Model model,
		@RequestParam(name = "area") String area,
		@RequestParam(name="empleado") String empleado,
		@RequestParam(name = "fechaInicio") String fechaInicio,
		@RequestParam(name = "horaInicio")String horaInicio,
		@RequestParam(name = "fechaFin")String fechaFin,
		@RequestParam(name = "horaFin")String horaFin,
		@RequestParam(name = "horaFin")String motivo)
		{
		
		//Papeleta papeleta = new Papeleta();
		
		
		
		return "papeleta_listado";
	}
	

}


