package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.papeleta.model.Area;
import edu.cientifica.papeleta.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	
	

	@Override
	public List<Area> listarAreas() {
		// TODO Auto-generated method stub
		List<Area> listadoAreas;
		listadoAreas =  new ArrayList<Area>();
		listadoAreas.add(new Area(1,"GG", "Gerencia General", null));
		listadoAreas.add(new Area(2,"ADM", "Administracion", null));
		listadoAreas.add(new Area(3,"UCONT", "Unidad de Contabilidad", null));
		listadoAreas.add(new Area(4,"ULOG","Unidad de Logistica", null));
		listadoAreas.add(new Area(5,"UTES", "Unidad de Tesorería", null));
		
		
		return listadoAreas;
	}
	
	@Override
	public Area buscarArea(int codigo) {
		List<Area> listadoAreas;
		listadoAreas = listarAreas();
		
		for (Area area : listadoAreas) {
			
			if (area.getIdArea()==codigo) {
				
				return area;
			}
		}
		
		return null;
	}

}
