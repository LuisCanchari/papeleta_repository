package edu.cientifica.papeleta.model;

import java.sql.Date;

public class Papeleta {
	private int idPapeleta;
	private Empleado empleado;
	private Motivo motivo;
	private Date fechainicio;
	private int horainicio;
	private Date fechafin;
	private int horafin;
	private String observaciones;
	
	public Papeleta() {
		super();
	}

	public int getIdPapeleta() {
		return idPapeleta;
	}

	public void setIdPapeleta(int idPapeleta) {
		this.idPapeleta = idPapeleta;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public int getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(int horainicio) {
		this.horainicio = horainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public int getHorafin() {
		return horafin;
	}

	public void setHorafin(int horafin) {
		this.horafin = horafin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Papeleta [idPapeleta=" + idPapeleta + ", empleado=" + empleado + ", motivo=" + motivo + ", fechainicio="
				+ fechainicio + ", horainicio=" + horainicio + ", fechafin=" + fechafin + ", horafin=" + horafin
				+ ", observaciones=" + observaciones + "]";
	}
	
	

}
