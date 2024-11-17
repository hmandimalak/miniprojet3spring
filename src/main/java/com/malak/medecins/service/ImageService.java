package com.malak.medecins.service;
import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.malak.medecins.entities.Image;

@Service
public interface ImageService {
	 Image uplaodImage(MultipartFile file) throws IOException;
	 Image getImageDetails(Long id) throws IOException;
	 ResponseEntity<byte[]> getImage(Long id) throws IOException;
	 void deleteImage(Long id) ;
	 Image uploadImageMed(MultipartFile file, Long idmedecin) throws IOException;
	 List<Image> getImagesParMed(Long medId);

}
