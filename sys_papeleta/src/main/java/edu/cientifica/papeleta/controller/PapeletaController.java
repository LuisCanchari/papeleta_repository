package edu.cientifica.papeleta.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

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
import edu.cientifica.papeleta.model.Motivo;
import edu.cientifica.papeleta.model.Papeleta;
import edu.cientifica.papeleta.service.AreaService;
import edu.cientifica.papeleta.service.EmpleadoService;
import edu.cientifica.papeleta.service.MotivoService;
import edu.cientifica.papeleta.service.PapeletaService;

@RequestMapping("/papeleta")
@Controller
public class PapeletaController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private AreaService areaService;

	@Autowired
	private EmpleadoService empleadoService;

	@Autowired
	private PapeletaService papeletaService;
	
	@Autowired
	private MotivoService motivoService;

	/* Presenta el formulario de papeleta*/
	@RequestMapping(value = { "/form" }, method = RequestMethod.GET)
	public String papletaNew(Model model) {

		List<Area> listadoAreas;
		listadoAreas = areaService.listarAreas();

		List<Empleado> listadoEmpleados;
		listadoEmpleados = empleadoService.listarEmpleados();

		model.addAttribute("listadoAreas", listadoAreas);
		model.addAttribute("listadoEmpleados", listadoEmpleados);

		LOG.info("proceso el metodo papeleta_nueva");
		return "papeleta_form";
	}

	/* Crear Papeleta con los datos recibidos del formulario*/
	@RequestMapping(value = { "/crear" }, method = RequestMethod.POST)
	public String crearPapeleta(Model model, @RequestParam(name = "area") int idArea,
		@RequestParam(name = "empleado") int idEmpleado, @RequestParam(name = "fechaInicio") Date fechaInicio,
		@RequestParam(name = "horaInicio") String horaInicio, @RequestParam(name = "fechaFin") Date fechaFin,
		@RequestParam(name = "horaFin") String horaFin, @RequestParam(name = "motivo") int  idMotivo) {
		
		Papeleta papeleta = new Papeleta();
		
		
		Empleado empleado = empleadoService.buscarEmpleado(idEmpleado);
		Area area = areaService.buscarArea(idArea);
		empleado.setArea(area);
		Motivo motivo = motivoService.buscarMotivos(idMotivo); 

		papeleta.setIdPapeleta(1);
		papeleta.setEmpleado(empleado);
		papeleta.setMotivo(motivo);
		papeleta.setFechaInicio(fechaInicio);
		papeleta.setHoraInicio(horaInicio);
		papeleta.setFechaFin(fechaFin);
		papeleta.setHoraFin(horaFin);
		
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
//      String dateInString = "7-Jun-2013";
		//papeleta.setFechafin(d.of(year, month, dayOfMonth));
		
		papeletaService.agregarPapeleta(papeleta);
				
		LOG.info("objeto");
		LOG.info(empleado.toString());
		LOG.info(area.toString());
		LOG.info(motivo.toString());
		LOG.info(fechaInicio.toString());
		LOG.info(fechaFin.toString());
		LOG.info(horaInicio.toString());
		LOG.info(horaFin.toString());

		return "redirect:/papeleta/listar";
	}
	
	@RequestMapping(value = { "/listar" }, method = RequestMethod.GET)
	public String listarPapeleta(Model model) {
		model.addAttribute("papeletas", papeletaService.listarPapeletas());
		return "papeleta_lista";
	}
	
}
