package edu.zamorano.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zamorano.Repository.TemporalRepository;
import edu.zamorano.model.*;

@Service
public class TemporalBDService {

	@Autowired
	TemporalRepository jpTmp;
	
	public List<Tablamemoria> getAllDatos(){
		List<Tablamemoria> lt=jpTmp.findAll();//jpTmp.findAllTablamemoria();//
		if(lt!=null) {
			return lt;
		}
		return new ArrayList<Tablamemoria>();
	}
	
	public Tablamemoria getIDTabla(Integer id) {
		return jpTmp.findById(id).get();
	}
	
	public Tablamemoria updIDTabla(Tablamemoria tmp) {
		return jpTmp.save(tmp);
	}
	
	public void delIDTablamemoria(Integer id) {
		jpTmp.deleteById(id);
	}
	
	
}
