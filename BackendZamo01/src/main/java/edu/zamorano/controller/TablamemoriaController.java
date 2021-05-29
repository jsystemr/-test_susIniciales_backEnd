package edu.zamorano.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.zamorano.model.Tablamemoria;
import edu.zamorano.services.TemporalBDService;

@RestController
@RequestMapping("/")
public class TablamemoriaController {

	Logger log=LoggerFactory.getLogger(getClass().getName());
	
	@Autowired
	public TemporalBDService jpTmp;
	

	@GetMapping("/")
	public String index(){
		return "redirect:tablamemoria";
	}
	
	@GetMapping("tablamemoria")
	public List<Tablamemoria> Tablamemoria(){
		return jpTmp.getAllDatos();
	}
	
	@RequestMapping(path="tablamemoria/new",method = RequestMethod.POST)
	public Tablamemoria newTablamemoria(@RequestBody Tablamemoria tmp){
		Tablamemoria newtmp=new Tablamemoria();
		newtmp=tmp;
		return newtmp;
	}
	
	@GetMapping("tablamemoria/{id}")
	public Tablamemoria getID(@PathVariable Integer id) {
		return jpTmp.getIDTabla(id);
	}
	
	@RequestMapping(value = "tablamemoria/{id}", 
			  produces = "application/json", 
			  method=RequestMethod.PUT)
	public Tablamemoria updateTmp(@RequestBody Tablamemoria tmp,@PathVariable Integer id) {
		Tablamemoria updTmp=jpTmp.getIDTabla(id);
		updTmp.setNombre(tmp.getNombre());
		updTmp.setMonoto_deducir(tmp.getMonoto_deducir());
		updTmp.setFecha_cambio(tmp.getFecha_cambio());
		return jpTmp.updIDTabla(updTmp);
	}
	
	@DeleteMapping("tablamemoria/{id}")
	public void delidtabla(@PathVariable Integer id) {
		jpTmp.delIDTablamemoria(id);
		}
}
