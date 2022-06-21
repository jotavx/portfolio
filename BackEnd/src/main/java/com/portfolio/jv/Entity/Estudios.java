package com.portfolio.jv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Estudios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String tituloEstudios;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String casaEstudios;

     @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String periodo;
    
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String urlLogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloEstudios() {
        return tituloEstudios;
    }

    public void setTituloEstudios(String tituloEstudios) {
        this.tituloEstudios = tituloEstudios;
    }

    public String getCasaEstudios() {
        return casaEstudios;
    }

    public void setCasaEstudios(String casaEstudios) {
        this.casaEstudios = casaEstudios;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

}

