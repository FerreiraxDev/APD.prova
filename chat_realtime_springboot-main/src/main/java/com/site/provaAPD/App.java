package com.site.provaAPD;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.site.provaAPD.config.ObjMsg;

@Controller//controlador para gerenciar msgs
public class App {

    @MessageMapping("/chatMessage")//dependencia para receber mensagem, na rota chatMessage
    @SendTo("/canal")//dependencia para enviar mensagem, na rota canal
    //metodo sendMessage chamado
    public ObjMsg sendMessage(ObjMsg message){
        return message;
    }

}
