package com.vk.Job.Management.System.Service;

import com.vk.Job.Management.System.Model.OAuthUser;
import com.vk.Job.Management.System.Repo.OAuthUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class OAuthUserService {

    @Autowired
    private OAuthUserRepo oAuthUserRepo;

        public void saveUser(OAuth2User oAuth2User) {
            OAuthUser user = new OAuthUser();
            user.setEmail(oAuth2User.getAttribute("email"));
            user.setName(oAuth2User.getAttribute("name"));
            // Set other attributes as needed

            oAuthUserRepo.save(user);
        }
}
