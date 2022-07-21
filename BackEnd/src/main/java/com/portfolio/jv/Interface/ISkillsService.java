
package com.portfolio.jv.Interface;

import com.portfolio.jv.Entity.Skills;
import java.util.List;


public interface ISkillsService{
    
      //Traer una lista de skills
    public List<Skills> getSkills();
    
     //Guardar un objeto de tipo Skills
    public Skills saveSkills (Skills skills);
    
     //Eliminar un objeto por ID
    public void deleteSkills (Long id);
    
    
     //Buscar Skills por ID
     public Skills findSkills (Long id);
    
    
}
