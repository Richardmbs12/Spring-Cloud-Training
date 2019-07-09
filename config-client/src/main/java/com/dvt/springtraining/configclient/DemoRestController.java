package com.dvt.springtraining.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoRestController {

    @Value("${current.profile}")
    private String currentProfile;

    @GetMapping
    public String getDemoProperty() {
        return currentProfile;
    }
}
