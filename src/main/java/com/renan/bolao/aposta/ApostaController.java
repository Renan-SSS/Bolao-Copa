package com.renan.bolao.aposta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApostaController {
    @GetMapping(value = "/aposta")
    public String login(){
        return "charts";
    }
}
