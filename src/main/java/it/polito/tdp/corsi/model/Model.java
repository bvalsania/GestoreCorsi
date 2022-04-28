package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.studenti.tdp.corsi.db.CorsoDAO;
import it.studenti.tdp.corsi.db.StudentiDAO;

public class Model {
	
	private CorsoDAO corsoDao;
	private StudentiDAO studentiDao;
	
	public Model() {
		this.corsoDao = new CorsoDAO();
		this.studentiDao = new StudentiDAO();
		
	}
	public List<Corso> getCorsiByPeriodo(int periodo){
		return this.corsoDao.getCorsiByPeriodo(periodo);
		
	}
	
	public Map<Corso, Integer> getIscritti(int periodo){
		return this.corsoDao.getIscritti(periodo);
	}
	
	public List<Studente> getStudentiByCorso(String codins){
		return this.studentiDao.getStudentiByCorso(codins);
	}
	
	public List<Divisione> getDivisioneStudenti(String codins){
		return this.studentiDao.getDivisioneStudenti(codins);
	}
}

