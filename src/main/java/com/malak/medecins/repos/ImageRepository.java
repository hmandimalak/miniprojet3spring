package com.malak.medecins.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malak.medecins.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {

}
