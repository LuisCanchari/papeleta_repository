package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.papeleta.model.Motivo;
import edu.cientifica.papeleta.service.MotivoService;

@Service
public class MotivoServiceImpl implements MotivoService {
	private List<Motivo> listaMotivos;

	public MotivoServiceImpl() {
		super();
		listaMotivos = new ArrayList<>();
		listaMotivos.add(new Motivo(1, "Descanso Médico", "Con goce"));
		listaMotivos.add(new Motivo(2, "Cita Médica", "Con goce"));
		listaMotivos.add(new Motivo(3, "Capacitación Oficializada", "Con goce"));
		listaMotivos.add(new Motivo(4, "Comisión de servicios", "Con goce"));
		listaMotivos.add(new Motivo(5, "Onomastico", "Con goce"));
		listaMotivos.add(new Motivo(6, "Vacaciones", "Con goce"));
		listaMotivos.add(new Motivo(7, "Otro", "Con goce"));
		listaMotivos.add(new Motivo(8, "Permiso Particular", "Sin goce"));
		listaMotivos.add(new Motivo(9, "Capacitación no oficial", "Sin goce"));
		listaMotivos.add(new Motivo(10, "Otro", "Sin goce"));
		listaMotivos.add(new Motivo(11, "Omisión de marcado", "Especial"));
		listaMotivos.add(new Motivo(12, "Matrimonio", "Especial"));
		listaMotivos.add(new Motivo(13, "Fallecimiento familiar", "Especial"));
		listaMotivos.add(new Motivo(14, "Enfermedad familiar", "Especial"));
		listaMotivos.add(new Motivo(15, "Licencia paternidad", "Especial"));
		
	}

	@Override
	public List<Motivo> listarMotivos() {

		return listaMotivos;
	}

	@Override
	public Motivo buscarMotivos(int id) {
		for (Motivo motivo : listaMotivos) {
			if (motivo.getIdMotivo() == id) {
				return motivo;
				}
			}
		return null;
	}

}
