package com.dancas.infoproperties.configuration;

import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class BuildPropertiesConfig {

    @Bean
    public BuildProperties getBuildProperties(){
       Properties properties = new Properties();
       properties.setProperty("name", "uno");
       return new BuildProperties(properties);
    }

}
