
package com.portfolio.jv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String skill;
     
    @NotNull
    @Size(min = 1, max = 255, message = "No cumple con la longitud")
    private String porcentaje;
    
     @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String urlLogo;

    public Long getId() {
        return id;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

     

}
