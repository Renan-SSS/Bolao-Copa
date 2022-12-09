package com.renan.bolao.selecao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelecaoController {
    @GetMapping(value = "/selecao")
    public String login(){
        return "tables";
    }

}
