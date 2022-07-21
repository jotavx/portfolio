
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Experiencia;
import com.portfolio.jv.Interface.IExperienciaService;
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
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;

     @GetMapping("experiencias/traer")
    public ResponseEntity<List<Experiencia>> getExperiencia(){
        List<Experiencia> experiencias = iexperienciaService.getExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
       @PreAuthorize("hasRole('ADMIN')")
      @PostMapping("experiencias/crear")
  public ResponseEntity<Experiencia> createExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia = iexperienciaService.saveExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.OK);
     }

      @PreAuthorize("hasRole('ADMIN')")
     @DeleteMapping("experiencias/borrar/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id){
        iexperienciaService.deleteExperiencia(id);
        return new ResponseEntity(HttpStatus.OK);
    }
     
      @PreAuthorize("hasRole('ADMIN')")
      @PutMapping("experiencias/editar")
    public ResponseEntity<Experiencia> editExperiencia (@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = iexperienciaService.saveExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    
}

@GetMapping("/experiencias/traer/perfil")
public Experiencia findExperiencia(){
return iexperienciaService.findExperiencia((long)1);
}
   

}

