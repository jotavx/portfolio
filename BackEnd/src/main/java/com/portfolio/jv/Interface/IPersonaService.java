/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jv.Interface;

import com.portfolio.jv.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona 
    
    public Persona savePersona (Persona persona) ;
    
    //Eliminar un usuario 
    
    public void deletePersona(Long id) ;
    
    //Buscar una persona
    
    public Persona findPersona(Long id);
    
}
