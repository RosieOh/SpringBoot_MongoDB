package com.mongodb_test.controller;

import com.mongodb_test.service.ShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShelterController {
    private final ShelterService shelterService;

    @GetMapping("api/shelter/find/earthquakes/{title}")
    public String findById(@PathVariable String title) {
        System.out.println("test");
        return null;
    }
}
