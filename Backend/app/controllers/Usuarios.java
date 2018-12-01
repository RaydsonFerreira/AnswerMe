package controllers;

import java.util.List;

import models.*;
import play.db.jpa.JPA;
import play.mvc.*;

import com.fasterxml.jackson.*;

public class Usuarios extends InternalController {

    public static void getUsuario(int id_usuario){
        Usuario user = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.id = " + id_usuario, Usuario.class).getSingleResult();
        renderJSON(user);
    }

    public static void postUsuario(){
        Usuario usuario = getBody(Usuario.class);

        usuario.save();

        Mensagem m = new Mensagem("USUARIO CADASTRADO COM SUCESSO");
        renderJSON(m);
    }

}
