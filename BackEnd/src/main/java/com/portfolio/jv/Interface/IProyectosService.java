
package com.portfolio.jv.Interface;

import com.portfolio.jv.Entity.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> getProyectos();
    
    public Proyectos saveProyectos(Proyectos proyectos);
    
    public void deleteProyectos(Long id);
    
    public Proyectos findProyectos(Long id);
}
