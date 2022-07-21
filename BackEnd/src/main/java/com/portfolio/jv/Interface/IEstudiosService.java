
package com.portfolio.jv.Interface;

import com.portfolio.jv.Entity.Estudios;
import java.util.List;


public interface IEstudiosService {
     //Traer una lista de estudios
     public List<Estudios>getEstudios();

    //Guardar un objeto de tipo experiencia
    public Estudios saveEstudios (Estudios estudios);

   //Eliminar un objeto por ID
   public void deleteEstudios (Long id);

  //Buscar experiencia por ID
  public Estudios findEstudios(Long id);

 
}


