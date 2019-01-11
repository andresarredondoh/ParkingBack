package com.ceiba.demo.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registro" )
@Access(AccessType.FIELD)
public class Registro {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable= false)
	private Long id;
	
	@Column(name ="tipo_de_vehiculo", nullable=false, length = 45)
    private String tipoVehiculo;
	
	@Column(name ="placa", nullable=false, length = 45)
    private String placa;
	
	@Column(name ="cilindraje", length = 255)
    private Integer cilindraje;
	
	@Column(name ="ingreso", nullable=false, length = 255)
    private Date ingreso;
	
	@Column(name ="salida", length = 30)
    private Date salida;
	
	@Column(name ="pago",  length = 150)
    private Double pago;
	
	@Column(name="estado")
	private boolean estado;

	public String getPlaca(){
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}

	public Date getSalida() {
		return salida;
	}

	public void setSalida(Date salida) {
		this.salida = salida;
	}

	public Double getPago() {
		return pago;
	}

	public void setPago(Double pago) {
		this.pago = pago;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}



}
