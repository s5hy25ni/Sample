package org.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/api/sample")
    public List<String> List(){
        return Arrays.asList("Sample1", "Sample2");
    }
}
