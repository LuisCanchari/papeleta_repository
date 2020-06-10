package edu.cientifica.papeleta.model;

import java.util.Date;

public class Empleado extends Persona {
	private Area area;
	private Date fechaIngreso;
	private int tipoEmpleado;

	public Empleado() {
		super();
	}
	
	/*Crea empleado con padre persona*/
	public Empleado(int idPersona, int numeroDocumento, String nombres, String primerApellido, String segundoApellido,
			String genero, int tipoEmpleado) {
		super(idPersona, numeroDocumento, nombres, primerApellido, segundoApellido,genero);
		this.tipoEmpleado = tipoEmpleado;
		
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(int tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [area=" + area + ", fechaIngreso=" + fechaIngreso + ", tipoEmpleado=" + tipoEmpleado
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
