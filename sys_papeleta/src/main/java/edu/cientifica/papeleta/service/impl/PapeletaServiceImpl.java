package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.papeleta.model.Papeleta;
import edu.cientifica.papeleta.service.PapeletaService;

@Service
public class PapeletaServiceImpl implements PapeletaService{
	private List<Papeleta> listaPapeleta;
		
	public PapeletaServiceImpl() {
		super();
		listaPapeleta =  new ArrayList<Papeleta>();
	}
	
	@Override
	public List<Papeleta> listarPapeletas() {
		return listaPapeleta;
	}
	
	@Override
	public int agregarPapeleta(Papeleta p) {
		listaPapeleta.add(p);
		return 0;
	}
	
	@Override
	public Papeleta buscarPapeleta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
