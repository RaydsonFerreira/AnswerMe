package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

import play.data.validation.Required;
import play.data.validation.Valid;
import play.db.jpa.GenericModel;


@Entity
@Table(name = "jogo_pergunta_resposta")
public class JogoPerguntaResposta extends GenericModel {
    @Id
    @Column(name = "id_convite")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_jogo",nullable=false)
    public Jogo jogo;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_pergunta",nullable=false)
    public Pergunta pergunta;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_resposta",nullable=false)
    public Resposta resposta;

    public JogoPerguntaResposta(Jogo jogo, Pergunta pergunta, Resposta resposta) {
        this.jogo = jogo;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
}
