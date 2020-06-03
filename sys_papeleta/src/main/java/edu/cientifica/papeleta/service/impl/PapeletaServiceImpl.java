package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cientifica.papeleta.model.Papeleta;
import edu.cientifica.papeleta.service.PapeletaService;

public class PapeletaServiceImpl implements PapeletaService{
	
	@Override
	public List<Papeleta> listarPapeletas() {
		
		List<Papeleta> listaPapeleta = new ArrayList();
		listaPapeleta.add(new Papeleta());
		

		return listaPapeleta;
	}
	@Override
	
	public Papeleta buscarPapeleta() {
		// TODO Auto-generated method stub
		return null;
	}

}
