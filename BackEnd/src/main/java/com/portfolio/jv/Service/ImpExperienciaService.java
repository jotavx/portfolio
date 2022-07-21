
package com.portfolio.jv.Service;

import com.portfolio.jv.Entity.Experiencia;
import com.portfolio.jv.Interface.IExperienciaService;
import com.portfolio.jv.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService {
@Autowired IExperienciaRepository iexperienciaRepository;
      
    
    @Override
    public List<Experiencia> getExperiencia() {
          List<Experiencia> experiencia = iexperienciaRepository.findAll();
      return experiencia;
    }

    @Override
    public Experiencia saveExperiencia(Experiencia experiencia) {
        return iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
          iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
         Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
    return experiencia;
    }
    
}
