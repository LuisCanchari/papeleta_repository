package edu.cientifica.papeleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.papeleta.model.Papeleta;
import edu.cientifica.papeleta.service.PapeletaService;

@Service
public class PapeletaServiceImpl implements PapeletaService{
	List<Papeleta> lista =  new ArrayList<Papeleta>();
	
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
	
	public int agregarPapeleta(Papeleta p) {
		// TODO Auto-generated method stub
	
	
		return 0;
	}
	

}
