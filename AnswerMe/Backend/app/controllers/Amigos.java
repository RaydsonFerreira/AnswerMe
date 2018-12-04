package controllers;

import java.util.List;

import java.security.MessageDigest;

import static serializers.AmigoSerializar.findByAmigosSerializer;

import models.*;
import play.db.jpa.JPA;
import play.mvc.*;

import com.fasterxml.jackson.*;

public class Amigos extends InternalController {

    public static void addAmigo(int id_requerente, String username_destino){

        Usuario usuario_destino = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.usr_usuario = '" + username_destino + "'", Usuario.class).getSingleResult();

        try {
            Amigo amigo = (Amigo) JPA.em().createNativeQuery("SELECT * from Amigo a WHERE a.fk_id_usuario1 = " + id_requerente + " AND a.fk_id_usuario2 = " + usuario_destino.id, Amigo.class).getSingleResult();
            Mensagem m = new Mensagem("Já são amigos");
            renderJSON(m);
        } catch (Exception e){
            Usuario usuario_requerente = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.id_usuario = " + id_requerente, Usuario.class).getSingleResult();

            Amigo amigos = new Amigo(usuario_requerente, usuario_destino);

            amigos.save();

            Mensagem m = new Mensagem("Adicionado com sucesso");

            renderJSON(m);

        }
    }

    public static void getAmigos(int id_requerente){
        List<Amigo> userAmigos = JPA.em().createNativeQuery("SELECT * from Amigo a WHERE a.fk_id_usuario1 = " + id_requerente, Amigo.class).getResultList();
        renderJSON(findByAmigosSerializer.serialize(userAmigos));
    }
}
