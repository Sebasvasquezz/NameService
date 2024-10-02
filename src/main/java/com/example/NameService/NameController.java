package com.example.NameService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName() {
        return "Juan Sebastian Vasquez Vega"; // Reemplaza "TuNombre" por tu nombre real
    }
}
