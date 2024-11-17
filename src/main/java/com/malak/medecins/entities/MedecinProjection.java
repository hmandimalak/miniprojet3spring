package com.malak.medecins.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomMed", types = { Medecin.class })
public interface MedecinProjection {
	public String getNommedecin();

}
