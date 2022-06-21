
package com.portfolio.jv.Repository;


import com.portfolio.jv.Entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudiosRepository extends JpaRepository<Estudios, Long>{

}
