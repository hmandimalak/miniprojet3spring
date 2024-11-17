package com.malak.medecins.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.malak.medecins.entities.Faculte;
import com.malak.medecins.entities.Medecin;

@RepositoryRestResource(path = "rest")
public interface MedecinRepository  extends JpaRepository<Medecin, Long>  {
	 List<Medecin> findByNommedecin(String nom);
	 List<Medecin> findByNommedecinContains(String nom); 
	 
	 @Query("select m from Medecin m where m.nommedecin like %?1 and m.specialite > ?2")
	 List<Medecin> findByNomspecialite (String nom, String specialite);
	 
	 @Query("select m from Medecin m where m.faculte = ?1 ")
	 List<Medecin> findByFaculte (Faculte faculte);

	 List<Medecin> findByFaculteIdfac(Long id);
	 
	 List<Medecin> findByOrderByNommedecinAsc();
	 
	 @Query("select m from Medecin m order by m.nommedecin ASC, m.specialite DESC")
	 List<Medecin> trierMedecinsNomsSpecialite ();


}
