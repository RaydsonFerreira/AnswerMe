package controllers;

import java.util.List;
import java.util.ArrayList;

import java.security.MessageDigest;


import static serializers.ConviteSerializar.findByStatusSerializer;

import models.*;
import play.db.jpa.JPA;
import play.mvc.*;

import com.fasterxml.jackson.*;

public class Convites extends InternalController {

    public static void convidar(int id_envio, int id_recibo){

        Usuario usuario_envio = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.id_usuario = " + id_envio, Usuario.class).getSingleResult();
        Usuario usuario_recibo = (Usuario) JPA.em().createNativeQuery("SELECT * from Usuario u WHERE u.id_usuario = " + id_recibo, Usuario.class).getSingleResult();

        Convite c = new Convite(usuario_envio, usuario_recibo, "Aguardando");

        c.save();

        Mensagem m = new Mensagem("Convite enviado com sucesso");
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        renderJSON(m);
    }

    public static void convites(int id){
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        List<Convite> c = JPA.em().createNativeQuery("SELECT * from Convite c WHERE c.status = 'Aguardando' AND c.fk_id_usuario_recibo = " + id, Convite.class).getResultList();
        renderJSON(c);
    }

    public static void AceitarConvite(int id_envio, int id_recibo){
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        int a = JPA.em().createNativeQuery("UPDATE Convite SET status = 'Aceito' WHERE fk_id_usuario_envio = " + id_envio + " AND fk_id_usuario_recibo = " + id_recibo, Convite.class).executeUpdate();
        renderJSON(new Mensagem("Convite Aceito"));
    }

    public static void CancelarConvite(int id_envio, int id_recibo){
        int a = JPA.em().createNativeQuery("UPDATE Convite SET status = 'Cancelado' WHERE fk_id_usuario_envio = " + id_envio + " AND fk_id_usuario_recibo = " + id_recibo, Convite.class).executeUpdate();
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        renderJSON(new Mensagem("Convite Cancelado"));
    }

    public static void RecusarConvite(int id_envio, int id_recibo){
        int a = JPA.em().createNativeQuery("UPDATE Convite SET status = 'Recusado' WHERE fk_id_usuario_envio = " + id_envio + " AND fk_id_usuario_recibo = " + id_recibo, Convite.class).executeUpdate();
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        renderJSON(new Mensagem("Convite Recusado"));
    }

    public static void getStatusConvite(int id_envio, int id_recibo){
        Convite c = (Convite) JPA.em().createNativeQuery("SELECT * FROM Convite c WHERE c.fk_id_usuario_envio = " + id_envio + " AND c.fk_id_usuario_recibo = " + id_recibo, Convite.class).getSingleResult();
        Http.Header hd = new Http.Header();
        hd.name = "Access-Control-Allow-Origin";
        hd.values = new ArrayList<String>();
        hd.values.add("http://192.168.43.163:8080");
        Http.Response.current().headers.put("Access-Control-Allow-Origin",hd);
        new Thread() {

            @Override
            public void run() {
                
                while (!c.status.equals("Aprovado")){
                    try {
                        Thread.sleep(2000);
                        System.out.println("teste");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    if ((JPA.em().createNativeQuery("SELECT * FROM Convite c WHERE c.fk_id_usuario_envio = " + id_envio + " AND c.fk_id_usuario_recibo = " + id_recibo + " AND c.status = 'Aceito'", Convite.class).getResultList()).size() > 0) {
                        break;
                    }
        //            c = (Convite) JPA.em().createNativeQuery("SELECT * FROM Convite c WHERE c.fk_id_usuario_envio = " + id_envio + " AND c.fk_id_usuario_recibo = " + id_recibo, Convite.class).getSingleResult();
                    System.out.println(c.status);
                }

                System.out.println("já saiu");

                renderJSON(new Mensagem("ok"));
            }
        }.start();
    }
}
