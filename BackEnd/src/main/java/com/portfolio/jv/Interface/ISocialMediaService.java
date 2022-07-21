
package com.portfolio.jv.Interface;

import com.portfolio.jv.Entity.SocialMedia;
import java.util.List;


public interface ISocialMediaService {
    
    public List<SocialMedia> getSocialMedia();
    
    public SocialMedia saveSocialMedia(SocialMedia socialMedia);
    
    public void deleteSocialMedia(Long id);
    
    public SocialMedia findSocialMedia(Long id);
    
    
}
