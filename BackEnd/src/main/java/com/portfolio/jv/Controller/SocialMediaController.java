
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.SocialMedia;
import com.portfolio.jv.Interface.ISocialMediaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SocialMediaController {
    @Autowired ISocialMediaService isocialmediaService;
    
        @GetMapping("socialmedia/traer")
    public ResponseEntity<List<SocialMedia>> getSocialMedia(){
        List<SocialMedia> socialMedia = isocialmediaService.getSocialMedia();
        return new ResponseEntity<>(socialMedia, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("socialmedia/crear")
    public ResponseEntity<SocialMedia> createSocialMedia(@RequestBody SocialMedia socialMedia){
        SocialMedia newSocialMedia = isocialmediaService.saveSocialMedia(socialMedia);
        return new ResponseEntity<>(newSocialMedia, HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("socialmedia/borrar/{id}")
    public ResponseEntity<?> deleteSocialMedia(@PathVariable("id") Long id){
        isocialmediaService.deleteSocialMedia(id);
        return new ResponseEntity(HttpStatus.OK);
    }

       @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("socialmedia/editar")
    public ResponseEntity<SocialMedia> editSocialMedia (@RequestBody SocialMedia socialMedia) {
        SocialMedia updateSocialMedia = isocialmediaService.saveSocialMedia(socialMedia);
        return new ResponseEntity<>(updateSocialMedia, HttpStatus.OK);
    }


}
