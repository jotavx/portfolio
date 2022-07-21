
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Proyectos;
import com.portfolio.jv.Interface.IProyectosService;
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
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
        @GetMapping("proyectos/traer")
    public ResponseEntity<List<Proyectos>> getProyectos(){
        List<Proyectos> proyectos = iproyectosService.getProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("proyectos/crear")
    public ResponseEntity<Proyectos> createProyectos(@RequestBody Proyectos proyectos){
        Proyectos newProyectos = iproyectosService.saveProyectos(proyectos);
        return new ResponseEntity<>(newProyectos, HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("proyectos/borrar/{id}")
    public ResponseEntity<?> deleteProyectos(@PathVariable("id") Long id){
        iproyectosService.deleteProyectos(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
        @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("proyectos/editar")
    public ResponseEntity<Proyectos> editProyectos (@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = iproyectosService.saveProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
}
