// this file is 'java base config' it replace to the 'XML' file.

package org.vk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.vk.Desktop;

@Configuration
public class AppCofig {

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
