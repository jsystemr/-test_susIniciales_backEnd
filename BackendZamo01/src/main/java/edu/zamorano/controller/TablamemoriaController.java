package edu.zamorano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zamorano.model.TablaMemoria;
import edu.zamorano.services.TemporalBDService;

@RequestMapping("/")
public class TablamemoriaController {

	@Autowired
	public TemporalBDService jpTmp;
	
	@GetMapping("/tablamemoria")
	public List<TablaMemoria> Tablamemoria(){
		return jpTmp.getAllDatos();
	}
	
	@RequestMapping(path="/tablamemoria/new",method = RequestMethod.POST)
	public TablaMemoria newTablamemoria(@RequestBody TablaMemoria tmp){
		TablaMemoria newtmp=new TablaMemoria();
		newtmp=tmp;
		return newtmp;
	}
	
	@GetMapping("/tablamemoria/{id}")
	public TablaMemoria getID(@PathVariable Integer id) {
		return jpTmp.getIDTabla(id);
	}
	
	@RequestMapping(value = "/tablamemoria/{id}", 
			  produces = "application/json", 
			  method=RequestMethod.PUT)
	public TablaMemoria updateTmp(@RequestBody TablaMemoria tmp,@PathVariable Integer id) {
		TablaMemoria updTmp=jpTmp.getIDTabla(id);
		updTmp.setNombre(tmp.getNombre());
		updTmp.setMonoto_deducir(tmp.getMonoto_deducir());
		updTmp.setFechaCambio(tmp.getFechaCambio());
		return jpTmp.updIDTabla(updTmp);
	}
	
	@DeleteMapping("/tablamemoria/{id}")
	public void delidtabla(@PathVariable Integer id) {
		jpTmp.delIDTablamemoria(id);
		}
}
