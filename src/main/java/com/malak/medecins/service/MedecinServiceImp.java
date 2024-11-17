package com.malak.medecins.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.malak.medecins.entities.Faculte;
import com.malak.medecins.entities.Medecin;
import com.malak.medecins.repos.ImageRepository;
import com.malak.medecins.repos.MedecinRepository;
@Service
public class MedecinServiceImp implements MedecinService{
	
	@Autowired
	MedecinRepository medecinRepository;
	
	@Autowired
	ImageRepository imageRepository;

	@Override
	public Medecin saveMedecin(Medecin m) {
		
		return medecinRepository.save(m);
	}

	/*@Override
	public Medecin updateMedecin(Medecin m) {
		return medecinRepository.save(m);
	}*/
	@Override
	public Medecin updateMedecin(Medecin m) {
		//Long oldMedImageId = this.getMedecin(m.getIdmedecin()).getImage().getIdImage();
		//Long newMedImageId = m.getImage().getIdImage();
		Medecin medUpdated = medecinRepository.save(m);
		//if (oldMedImageId != newMedImageId) // si l'image a été modifiée
			//imageRepository.deleteById(oldMedImageId);
		return medUpdated;
	}

	@Override
	public void deleteMedecin(Medecin m) {
		medecinRepository.delete(m);
		
	}

	@Override
	public void deleteMedecinById(Long id) {
		medecinRepository.deleteById(id);

		
	}

	@Override
	public Medecin getMedecin(Long id) {
		return medecinRepository.findById(id).get();

	}

	@Override
	public List<Medecin> getAllMedecins() {
		return medecinRepository.findAll();
	}

	@Override
	public List<Medecin> findByNommedecin(String nom) {
		return medecinRepository.findByNommedecin(nom);
	}

	@Override
	public List<Medecin> findByNommedecinContains(String nom) {
		return medecinRepository.findByNommedecinContains(nom);
	}

	@Override
	public List<Medecin> findByNomspecialite(String nom, String specialite) {
		return medecinRepository.findByNomspecialite(nom, specialite);
	}

	@Override
	public List<Medecin> findByFaculte(Faculte faculte) {
		return medecinRepository.findByFaculte(faculte);
	}

	@Override
	public List<Medecin> findByFaculteIdfac(Long id) {
		return medecinRepository.findByFaculteIdfac(id);
	}

	@Override
	public List<Medecin> findByOrderByNommedecinAsc() {
		return medecinRepository.findByOrderByNommedecinAsc();
	}

	@Override
	public List<Medecin> trierMedecinsNomsSpecialite() {
		return medecinRepository.trierMedecinsNomsSpecialite();
	}

	
	

		



}