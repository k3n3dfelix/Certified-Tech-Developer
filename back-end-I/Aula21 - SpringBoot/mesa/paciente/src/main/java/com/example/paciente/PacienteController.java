package com.example.paciente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PacienteController {

    @GetMapping
    public String hello() {
        return "Hello!!!";
    }

}
