package com.renan.bolao.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}
