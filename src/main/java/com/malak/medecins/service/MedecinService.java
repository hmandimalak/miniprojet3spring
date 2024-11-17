package com.malak.medecins.service;

import java.util.List;


import com.malak.medecins.entities.Faculte;
import com.malak.medecins.entities.Medecin;

public interface MedecinService {
	Medecin saveMedecin(Medecin m);
	Medecin updateMedecin(Medecin m);
	List<Medecin> getAllMedecins();
	
	
	void deleteMedecin(Medecin m);
	void deleteMedecinById(Long id);
	Medecin getMedecin(Long id);
	
	List<Medecin> findByNommedecin(String nom);
	List<Medecin> findByNommedecinContains(String nom);
	List<Medecin> findByNomspecialite (String nom, String specialite);
	List<Medecin> findByFaculte (Faculte faculte);
	List<Medecin> findByFaculteIdfac(Long id);
	List<Medecin> findByOrderByNommedecinAsc();
	List<Medecin> trierMedecinsNomsSpecialite();
	
	
	
	

}
