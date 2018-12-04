package controllers;

import java.util.List;
import java.util.ArrayList;

import java.security.MessageDigest;

import static serializers.UsuariosSerializar.findByIdSerializer;

import models.*;
import play.db.jpa.JPA;
import play.mvc.*;

import com.fasterxml.jackson.*;

public class Usuarios extends InternalController {

    public static void getUsuario(int id_usuario){
        Usuario usuario = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.id_usuario = " + id_usuario, Usuario.class).getSingleResult();
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        renderJSON(findByIdSerializer.serialize(usuario));
    }

    public static void getUsuarios(){
        List<Usuario> ues = JPA.em().createNativeQuery("SELECT * from Usuario", Usuario.class).getResultList();
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        renderJSON(ues);
    }

    public static void postUsuario(String nome, String username, String senha){
        Usuario usuario = new Usuario(nome, username, senha);

        Criptografia c = new Criptografia();
        usuario.senha = c.gerarHash(usuario.senha, usuario.senha);
        usuario.save();

        Mensagem m = new Mensagem("USUARIO CADASTRADO COM SUCESSO");

        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);


        renderJSON(m);
    }

}
