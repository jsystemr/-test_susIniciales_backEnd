package edu.zamorano.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

//@Table(name = "tablamemoria")
@Entity(name = "Tablamemoria")
public class Tablamemoria {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String Nombre;
	private BigDecimal Monto_deducir;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date Fecha_cambio;
	public int getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public BigDecimal getMonto_deducir() {
		return Monto_deducir;
	}
	public void setMonto_deducir(BigDecimal monoto_deducir) {
		Monto_deducir = monoto_deducir;
	}
	public Date getFecha_cambio() {
		return Fecha_cambio;
	}
	public void setFecha_cambio(Date fechaCambio) {
		Fecha_cambio = fechaCambio;
	}
	
	
	
}
