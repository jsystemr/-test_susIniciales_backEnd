package edu.zamorano.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TablaMemoria")
public class TablaMemoria {
	@Id
	private Integer ID;
	private String Nombre;
	private BigDecimal Monoto_deducir;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date FechaCambio;
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
	public BigDecimal getMonoto_deducir() {
		return Monoto_deducir;
	}
	public void setMonoto_deducir(BigDecimal monoto_deducir) {
		Monoto_deducir = monoto_deducir;
	}
	public Date getFechaCambio() {
		return FechaCambio;
	}
	public void setFechaCambio(Date fechaCambio) {
		FechaCambio = fechaCambio;
	}
	
	
	
}
