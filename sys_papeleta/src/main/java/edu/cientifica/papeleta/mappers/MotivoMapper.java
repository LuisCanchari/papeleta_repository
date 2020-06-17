package edu.cientifica.papeleta.mappers;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.papeleta.model.Motivo;

@Mapper
public interface MotivoMapper {
	public Motivo motivoById(int id);

}
