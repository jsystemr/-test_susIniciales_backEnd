package edu.zamorano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.TemporalRepository;
import edu.zamorano.model.*;

@Service
public class TemporalBDService {

	@Autowired
	TemporalRepository jpTmp;
	
	public List<TablaMemoria> getAllDatos(){
		return jpTmp.findAll();
	}
	
	public TablaMemoria getIDTabla(Integer id) {
		return jpTmp.getById(id);
	}
	
	public TablaMemoria updIDTabla(TablaMemoria tmp) {
		return jpTmp.save(tmp);
	}
	
	public void delIDTablamemoria(Integer id) {
		jpTmp.deleteById(id);
	}
}
