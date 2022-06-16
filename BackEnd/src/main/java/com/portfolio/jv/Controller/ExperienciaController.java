
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Experiencia;
import com.portfolio.jv.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
     public List<Experiencia> getExperiencia(){
     return iexperienciaService.getExperiencia();
     }

      @PostMapping("experiencias/crear")
      public String createExperiencia(@RequestBody Experiencia experiencia) {
      iexperienciaService.saveExperiencia(experiencia);
      return "La experiencia fue creada correctamente";
     }


     @DeleteMapping("/experiencias/borrar/{id}")
     public String deleteExperiencia(@PathVariable Long id) {
     iexperienciaService.deleteExperiencia(id);
     return "La experiencia fue borrada correctamente";

     }
  
 

      @PutMapping("/experiencias/editar/{id}")
      public Experiencia editExperiencia(@PathVariable Long id,
                                                                 @RequestParam("nombre") String nuevoNombre,
                                                                   @RequestParam("descripcion") String nuevoDescripcion,
                                                                     @RequestParam("periodo") String nuevoPeriodo,
                                                                       @RequestParam("logo") String nuevoLogo){
         
 Experiencia experiencia = iexperienciaService.findExperiencia(id);

 experiencia.setNombre(nuevoNombre);
 experiencia .setDescripcion(nuevoDescripcion);
 experiencia.setPeriodo(nuevoPeriodo);
 experiencia.setLogo(nuevoLogo);

iexperienciaService.saveExperiencia(experiencia);
return experiencia;


}

@GetMapping("/experiencias/traer/perfil")
public Experiencia findExperiencia(){
return iexperienciaService.findExperiencia((long)1);
}
   

}

