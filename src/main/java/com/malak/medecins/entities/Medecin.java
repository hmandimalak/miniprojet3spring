package com.malak.medecins.entities;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Medecin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idmedecin;
	private String  nommedecin;
	private String specialite;
	private Date datenaissance;
	
	
	/*@OneToOne
	private Image image;*/
	
	@OneToMany (mappedBy = "medecin")
	 private List<Image> images;
	
	
	/*public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}*/


	@ManyToOne
	private Faculte faculte;
	
	public Medecin() {
		super();
	}
	
	public Medecin(String nommedecin, String specialite, Date datenaissance) {
		super();
		this.nommedecin = nommedecin;
		this.specialite = specialite;
		this.datenaissance = datenaissance;
	}
	
	public Faculte getFaculte() {
		return faculte;
	}

	public void setFaculte(Faculte faculte) {
		this.faculte = faculte;
	}

	public Long getIdmedecin() {
		return idmedecin;
	}
	public void setIdmedecin(Long idmedecin) {
		this.idmedecin = idmedecin;
	}
	public String getNommedecin() {
		return nommedecin;
	}
	public void setNommedecin(String nommedecin) {
		this.nommedecin = nommedecin;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}


	@Override
	public String toString() {
		return "Medecin [idmedecin=" + idmedecin + ", nommedecin=" + nommedecin + ", specialite=" + specialite
				+ ", datenaissance=" + datenaissance + "]";
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	
	 
	
	

}
