
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Estudios;
import com.portfolio.jv.Interface.IEstudiosService;
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
public class EstudiosController {
    @Autowired IEstudiosService iestudiosService;
    
    @GetMapping("estudios/traer") 
    public List<Estudios> getEstudios(){
        return iestudiosService.getEstudios();
    }
    
    @PostMapping("estudios/crear")
    public String createEstudios(@RequestBody Estudios estudios){
    iestudiosService.saveEstudios(estudios);
    return "Los datos han sido creados correctamente";
    }
    
    @DeleteMapping("estudios/borrar/{id}")
    public String deleteEstudios(@PathVariable Long id){
    iestudiosService.deleteEstudios(id);
    return "Los datos han sido eliminados correctamente";
            }
    
    @PutMapping("estudios/editar/{id}")
    public Estudios editEstudios(@PathVariable Long id, 
                                 @RequestParam("tituloEstudios") String nuevoTituloEstudios,
                                 @RequestParam("casaEstudios") String nuevoCasaEstudios,
                                 @RequestParam("periodo") String nuevoPeriodo,
                                 @RequestParam("urlLogo") String nuevoUrlLogo){
    
        Estudios estudios = iestudiosService.findEstudios(id);
        
        estudios.setTituloEstudios(nuevoTituloEstudios);
        estudios.setCasaEstudios(nuevoCasaEstudios);
        estudios.setPeriodo(nuevoPeriodo);
        estudios.setUrlLogo(nuevoUrlLogo);
        
        iestudiosService.saveEstudios(estudios);
        return estudios;
    }
    
    @GetMapping("/estudios/traer/perfil")
public Estudios findEstudios(){
return iestudiosService.findEstudios((long)1);
}
   
}
