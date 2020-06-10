package edu.cientifica.papeleta.service;

import java.util.List;

import edu.cientifica.papeleta.model.Papeleta;


public interface PapeletaService {
	public List<Papeleta> listarPapeletas();
	public Papeleta buscarPapeleta(int id);
	public int agregarPapeleta(Papeleta papeleta);

}
