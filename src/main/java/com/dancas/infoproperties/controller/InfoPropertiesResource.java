package com.dancas.infoproperties.controller;

import com.dancas.infoproperties.configuration.BuildPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoPropertiesResource {

    @Autowired
    BuildProperties buildProperties;

    @RequestMapping("/")
    public Map<String, String> index(){
        Map<String,String> buildInfo = new HashMap<String,String>();
        // Artifact's name from the pom.xml file
        buildInfo.put("name", buildProperties.getName());
        // Artifact version
        buildInfo.put("version", buildProperties.getVersion());
        // Date and Time of the build
        buildInfo.put("time", String.valueOf(buildProperties.getTime()));
        // Artifact ID from the pom file
        buildInfo.put("artifact",buildProperties.getArtifact());
        // Group ID from the pom file
        buildInfo.put("group", buildProperties.getGroup());
        return buildInfo;
    }
}
