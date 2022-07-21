
package com.portfolio.jv.Interface;
    
import com.portfolio.jv.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
     //Traer una lista de experiencias
     public List<Experiencia> getExperiencia();

    //Guardar un objeto de tipo experiencia
    public Experiencia saveExperiencia (Experiencia experiencia);

   //Eliminar un objeto por ID
   public void deleteExperiencia (Long id);

  //Buscar experiencia por ID
  public Experiencia findExperiencia(Long id);
}


