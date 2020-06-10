package edu.cientifica.papeleta.service;

import java.util.List;

import edu.cientifica.papeleta.model.Area;

public interface AreaService {
	public List<Area> listarAreas();
	public Area buscarArea(int codigo);
	public int agregarArea(Area area);
	

}
