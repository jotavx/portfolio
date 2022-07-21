
package com.portfolio.jv.Service;

import com.portfolio.jv.Entity.SocialMedia;
import com.portfolio.jv.Interface.ISocialMediaService;
import com.portfolio.jv.Repository.ISocialMediaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSocialMediaService implements ISocialMediaService{
    @Autowired ISocialMediaRepository isocialmediaRepository;
    
    @Override
    public List<SocialMedia> getSocialMedia() {
        List<SocialMedia> socialMedia = isocialmediaRepository.findAll();
        return socialMedia;
    }

    @Override
    public SocialMedia saveSocialMedia(SocialMedia socialMedia) {
       return isocialmediaRepository.save(socialMedia);
    }

    @Override
    public void deleteSocialMedia(Long id) {
       isocialmediaRepository.deleteById(id);
    }

    @Override
    public SocialMedia findSocialMedia(Long id) {
        SocialMedia socialMedia = isocialmediaRepository.findById(id).orElse(null);
        return socialMedia;
    }
    
}
