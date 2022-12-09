package com.renan.bolao.BomDia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BomDiaControlle {

        @GetMapping(value = "/bomdia")
        public String BomDia(){
            return "password";
        }

}
