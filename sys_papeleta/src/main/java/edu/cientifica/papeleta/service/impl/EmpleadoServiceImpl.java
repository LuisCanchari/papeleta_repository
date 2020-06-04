package edu.cientifica.papeleta.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.cientifica.papeleta.model.Empleado;
import edu.cientifica.papeleta.model.Persona;
import edu.cientifica.papeleta.service.AreaService;
import edu.cientifica.papeleta.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	private static final int EMPLEADO_728 = 1;
	private static final int EMPLEADO_CAS = 2;
	
	@Autowired 
	private AreaService areaService; 

	@Override
	public List<Empleado> listarEmpleados() {
		
		List<Empleado> listadoEmpleados;
		listadoEmpleados =  new ArrayList<Empleado>();
		
		Empleado e1 =  new Empleado(1, 10008080, "Juan", "Rios", "Diaz", "M", EMPLEADO_728); 
		e1.setArea(areaService.buscarArea(1));
		
		
		Empleado e2 =  new Empleado(1, 20008080, "Mario", "Teran", "Pascual", "M", EMPLEADO_CAS);
		e2.setArea(areaService.buscarArea(2));
		
		
		Empleado e3 =  new Empleado(1, 300080080, "Mia", "Soto", "Aliaga", "F", EMPLEADO_CAS);
		e3.setArea(areaService.buscarArea(3));
		
		
		Empleado e4 =  new Empleado (1, 40008080, "Katy", "Vszco", "Sullca", "F", EMPLEADO_728);
		e4.setArea(areaService.buscarArea(3));
		
		
		listadoEmpleados.add(e1);
		listadoEmpleados.add(e2);
		listadoEmpleados.add(e3);
		listadoEmpleados.add(e4);
		
		
		return listadoEmpleados;
	}

}
