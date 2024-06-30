package com.vk.Spring.OAuth3;

import org.springframework.security.core.userdetails.memory.UserAttribute;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String home(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
        Map<String, Object> userAttributes = oAuth2AuthenticationToken.getPrincipal().getAttributes();

        String name = (String) userAttributes.get("name");

        return name;
    }
}
