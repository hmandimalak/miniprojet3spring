package com.malak.medecins;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.malak.medecins.entities.Faculte;
import com.malak.medecins.entities.Medecin;

@SpringBootApplication
public class MedecinsApplication  implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MedecinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Medecin.class,Faculte.class);
		
	}
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}


}
