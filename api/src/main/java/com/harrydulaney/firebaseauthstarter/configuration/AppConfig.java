package com.harrydulaney.firebaseauthstarter.configuration;

import com.harrydulaney.firebaseauthstarter.model.UserPreferences;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  @Bean
  RestTemplate restTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
    return restTemplate;
  }


  @Bean
  @Scope("singleton")
  public UserPreferences userPreferences() {
    UserPreferences preferences = new UserPreferences();
    preferences.loadPreferences();
    return preferences;
  }

}