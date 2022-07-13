/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Persona;
import com.portfolio.jv.Interface.IPersonaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public ResponseEntity<List<Persona>> getPersona(){
        List<Persona> personas = ipersonaService.getPersona();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("personas/crear")
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
        Persona newPersona = ipersonaService.savePersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("personas/borrar/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id){
        ipersonaService.deletePersona(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    // URL:PUERTO/personas/editar/id/nombre $ apellido $ img
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("personas/editar")
    public ResponseEntity<Persona> editPersona (@RequestBody Persona persona) {
        Persona updatePersona = ipersonaService.savePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
    
 
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
}
