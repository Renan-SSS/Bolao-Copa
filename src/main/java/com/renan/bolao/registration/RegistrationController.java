package com.renan.bolao.registration;

import com.renan.bolao.aposta.ApostadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RegistrationController {

    ApostadorRepository apostadorRepository;
    @GetMapping("/")
    public String registervazio(){

        return "register";
    }
    @GetMapping(value = "/register")
    public String register(){

        return "register";
    }
}
