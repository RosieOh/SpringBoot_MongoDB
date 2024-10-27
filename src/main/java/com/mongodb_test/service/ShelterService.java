package com.mongodb_test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ShelterService {
    public List<String> getShelterList(String title) {
        System.out.println("test");
        return null;
    }

}
