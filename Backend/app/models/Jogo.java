package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

import play.data.validation.Required;
import play.data.validation.Valid;
import play.db.jpa.GenericModel;


@Entity
public class Jogo extends GenericModel {
    @Id
    @Column(name = "id_jogo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_usuario_envio",nullable=false)
    public Usuario usuarioEnvio;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id_usuario_recibo",nullable=false)
    public Usuario usuarioRecibo;

    public Jogo(Usuario usuarioEnvio, Usuario usuarioRecibo) {
        this.usuarioEnvio = usuarioEnvio;
        this.usuarioRecibo = usuarioRecibo;
    }
}
