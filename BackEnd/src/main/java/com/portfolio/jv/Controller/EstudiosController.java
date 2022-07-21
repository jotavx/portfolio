
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Estudios;
import com.portfolio.jv.Interface.IEstudiosService;
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
public class EstudiosController {
    @Autowired IEstudiosService iestudiosService;
    
    @GetMapping("estudios/traer") 
    public ResponseEntity<List<Estudios>> getEstudios(){
        List<Estudios> estudios = iestudiosService.getEstudios();
        return new ResponseEntity<>(estudios, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("estudios/crear")
    public ResponseEntity<Estudios> createEstudios(@RequestBody Estudios estudios){
        Estudios newEstudios = iestudiosService.saveEstudios(estudios);
        return new ResponseEntity<>(newEstudios, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("estudios/borrar/{id}")
    public ResponseEntity<?> deleteEstudios(@PathVariable("id") Long id){
        iestudiosService.deleteEstudios(id);
        return new ResponseEntity(HttpStatus.OK);
            }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("estudios/editar")
    public ResponseEntity<Estudios> editEstudios (@RequestBody Estudios estudios) {
        Estudios updateEstudios = iestudiosService.saveEstudios(estudios);
        return new ResponseEntity<>(updateEstudios, HttpStatus.OK);
    }
    
    @GetMapping("/estudios/traer/perfil")
public Estudios findEstudios(){
return iestudiosService.findEstudios((long)1);
}
   
}
