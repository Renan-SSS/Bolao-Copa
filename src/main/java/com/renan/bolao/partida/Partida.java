package com.renan.bolao.partida;

import com.renan.bolao.selecao.Selecao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mandante_id")
    Selecao mandante;
    @OneToOne
    @JoinColumn(name = "visitante_id")
    Selecao visitante;
    Integer golsMandante;
    Integer golsVisitante;

    public Partida(Selecao mandante, Selecao visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
    }
}
