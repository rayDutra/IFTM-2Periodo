package com.professorangoti.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("pag2")
    public String aula1(){
        return "pag2";
    }
    
    @GetMapping("pag1")
    public String abreP1(){
        return "pag1";
    }
}
