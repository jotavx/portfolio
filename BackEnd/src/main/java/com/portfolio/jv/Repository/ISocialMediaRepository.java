
package com.portfolio.jv.Repository;

import com.portfolio.jv.Entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISocialMediaRepository extends JpaRepository<SocialMedia, Long>{
    
}
