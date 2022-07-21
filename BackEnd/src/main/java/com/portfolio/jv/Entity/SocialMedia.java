
package com.portfolio.jv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class SocialMedia {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;
     
 
    @Size(min = 1, max = 500, message = "No cumple con la longitud.")
    private String instagram;
    
    @Size(min = 1, max = 500, message = "No cumple con la longitud.")
    private String facebook;
    
    @Size(min = 1, max = 500, message = "No cumple con la longitud.")
    private String linkedin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    
}
