package com.dimas.maryanto.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HaloController {

    @GetMapping(value = {"/halo"})
    public String sayHalo() {
        return "halo";
    }
}
