package controllers;

import java.util.List;
import java.util.ArrayList;

import models.*;
import play.db.jpa.JPA;
import play.mvc.*;


public class Login extends InternalController {

    public static void loginUser() {
        System.out.println("TESTEE");
        Usuario usuario = getBody(Usuario.class);
        System.out.println(usuario.username);

        Criptografia c = new Criptografia();
        usuario.senha = c.gerarHash(usuario.senha, usuario.senha);


        try {
            Usuario user = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.usr_usuario = '" + usuario.username + "' AND u.senha_usuario = '" + usuario.senha + "'", Usuario.class).getSingleResult();
            Mensagem m = new Mensagem("Usuario Encontrado!!!");
            Http.Header hd = new Http.Header();
            hd.name = "Access-Control-Allow-Origin";
            hd.values = new ArrayList<String>();
            hd.values.add("http://localhost:8080");
            Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
            renderJSON(m);
        } catch (Exception e) {
            Mensagem m = new Mensagem("Usuario não Encontrado!!!");
            Http.Header hd = new Http.Header();
            hd.name = "Access-Control-Allow-Origin";
            hd.values = new ArrayList<String>();
            hd.values.add("http://localhost:8080");
            Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
            renderJSON(m);
        }
    }

    public static void test(String body) {
        System.out.println(body);
    }
}
