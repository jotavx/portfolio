
package com.portfolio.jv.Controller;

import com.portfolio.jv.Entity.Skills;
import com.portfolio.jv.Interface.ISkillsService;
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
@CrossOrigin (origins = "http://localhost:4200")
public class SkillsController {
    @Autowired ISkillsService iskillsService;
    
        @GetMapping("skills/traer")
    public ResponseEntity<List<Skills>> getSkills(){
        List<Skills> skills = iskillsService.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
     }
        @PreAuthorize("hasRole('ADMIN')")
      @PostMapping("skills/crear")
    public ResponseEntity<Skills> createSkills(@RequestBody Skills skills){
        Skills newSkills = iskillsService.saveSkills(skills);
        return new ResponseEntity<>(newSkills, HttpStatus.OK);
     }
        @PreAuthorize("hasRole('ADMIN')")
        @DeleteMapping("/skills/borrar/{id}")
    public ResponseEntity<?> deleteSkills(@PathVariable("id") Long id){
        iskillsService.deleteSkills(id);
        return new ResponseEntity(HttpStatus.OK);
     }
     
     
      @PutMapping("/skills/editar")
    public ResponseEntity<Skills> editSkills (@RequestBody Skills skills) {
        Skills updateSkills = iskillsService.saveSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
}
      
      @GetMapping("/skills/traer/perfil")
      public Skills findSkills(){
          return iskillsService.findSkills((long)1);
      }
    
}
