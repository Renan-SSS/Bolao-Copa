package com.renan.bolao.partida;

import com.renan.bolao.selecao.Selecao;
import com.renan.bolao.selecao.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PartidaController {
    @Autowired
    private SelecaoRepository selecaoRepository;


    @GetMapping("/partida")
    public ModelAndView tables(){

        List<Selecao> selecoes = this.selecaoRepository.findAll();

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("selecoes", selecoes);
        return mv;
    }
    /* tentei fazer o botão de adicionar mas não consegui ir além disso */
    @PostMapping("/partida/new")
    public void botaometodo(String vasco){
        Selecao selecao = new Selecao(vasco);
        selecaoRepository.save(selecao);
    }
}
