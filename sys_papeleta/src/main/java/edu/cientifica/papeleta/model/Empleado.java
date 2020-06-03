package edu.cientifica.papeleta.model;

import java.util.Date;

public class Empleado extends Persona {
	private Area area;
	private Date fechaIngreso;
	private int tipoEmpleado;

	public Empleado() {
		super();
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
	

}
