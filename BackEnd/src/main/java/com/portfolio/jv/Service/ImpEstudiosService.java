
package com.portfolio.jv.Service;

import com.portfolio.jv.Entity.Estudios;
import com.portfolio.jv.Interface.IEstudiosService;
import com.portfolio.jv.Repository.IEstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEstudiosService implements IEstudiosService{
    @Autowired IEstudiosRepository iestudiosRepository;
    
    @Override
    public List<Estudios> getEstudios() {
         List<Estudios> estudios = iestudiosRepository.findAll();
      return estudios;
    }

    @Override
    public Estudios saveEstudios(Estudios estudios) {
        return iestudiosRepository.save(estudios);
    }

    @Override
    public void deleteEstudios(Long id) {
        iestudiosRepository.deleteById(id);
    }

    @Override
    public Estudios findEstudios(Long id) {
       Estudios estudios = iestudiosRepository.findById(id).orElse(null);
    return estudios;
    }
    
}
