package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

import play.data.validation.Required;
import play.data.validation.Valid;
import play.db.jpa.GenericModel;


@Entity
public class Resposta extends GenericModel {
    @Id
    @Column(name = "id_convite")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_usuario_Respondente",nullable=false)
    public Usuario usuarioRespondente;

    @Column(name = "status")
    public String alternativa;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_pergunta",nullable=false)
    public Pergunta pergunta;

    public Resposta(Usuario usuarioRespondente, String alternativa, Pergunta pergunta) {
        this.usuarioRespondente = usuarioRespondente;
        this.alternativa = alternativa;
        this.pergunta = pergunta;
    }
}
