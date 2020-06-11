package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.papeleta.model.Area;
import edu.cientifica.papeleta.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	private List<Area> listadoAreas;

	public AreaServiceImpl() {
		super();
		listadoAreas = new ArrayList<Area>();
		listadoAreas.add(new Area(1, "GG", "Gerencia General", null));
		listadoAreas.add(new Area(2, "ADM", "Administracion", null));
		listadoAreas.add(new Area(3, "UCONT", "Unidad de Contabilidad", null));
		listadoAreas.add(new Area(4, "ULOG", "Unidad de Logistica", null));
		listadoAreas.add(new Area(5, "UTES", "Unidad de Tesorería", null));
		listadoAreas.add(new Area(6, "ALM", "Unidad de Almacen", null));
	}

	@Override
	public List<Area> listarAreas() {
		/*conectar a bd*/
		return listadoAreas;
	}

	@Override
	public Area buscarArea(int codigo) {
		for (Area area : listadoAreas) {
			if (area.getIdArea() == codigo) {
				return area;
			}
		}

		return null;
	}

	@Override
	public int agregarArea(Area area) {
		listadoAreas.add(area);
		return 0;
	}

}
