package com.malak.medecins.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Faculte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfac;
	private String nomfac;
	
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "faculte")
	private List<Medecin> medecins;
	
	public Faculte() {}
	public Faculte(String nomfac, List<Medecin> medecins) {
		super();
		this.nomfac = nomfac;
		this.medecins=medecins;
	}
	public Long getIdfac() {
		return idfac;
	}
	public void setIdfac(Long idfac) {
		this.idfac = idfac;
	}
	public String getNomfac() {
		return nomfac;
	}
	public void setNomfac(String nomfac) {
		this.nomfac = nomfac;
	}
	public List<Medecin> getMedecins() {
		return medecins;
	}
	public void setMedecins(List<Medecin> medecins) {
		this.medecins = medecins;
	}

	
}
