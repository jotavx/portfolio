
package com.portfolio.jv.Repository;

import com.portfolio.jv.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository<Skills, Long>{

}
