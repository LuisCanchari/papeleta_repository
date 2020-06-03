package edu.cientifica.papeleta.model;

public class Motivo {
	private int idMotivo;
	private String descripcion;
	private String tipoMotivo;
	
	public Motivo() {
		super();
	}

	public Motivo(int idMotivo, String descripcion, String tipoMotivo) {
		super();
		this.idMotivo = idMotivo;
		this.descripcion = descripcion;
		this.tipoMotivo = tipoMotivo;
	}

	public int getIdMotivo() {
		return idMotivo;
	}

	public void setIdMotivo(int idMotivo) {
		this.idMotivo = idMotivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoMotivo() {
		return tipoMotivo;
	}

	public void setTipoMotivo(String tipoMotivo) {
		this.tipoMotivo = tipoMotivo;
	}

}
