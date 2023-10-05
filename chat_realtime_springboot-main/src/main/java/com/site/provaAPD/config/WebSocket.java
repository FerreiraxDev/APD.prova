package com.site.provaAPD.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker//dependencia de sistema de mensagens 
public class WebSocket implements WebSocketMessageBrokerConfigurer{

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/canal");
        config.setApplicationDestinationPrefixes("/app");
	}//configureMessageBroker usado para definir detalhes de como as msgs serão tratadas e transmitidas
    

    //endpoints para os clientes se conectarem simultaneamente 
    @Override
    public void registerStompEndpoints(StompEndpointRegistry config) {
        config.addEndpoint("conect");
        config.addEndpoint("conect").withSockJS();//biblioteca do Js
	}

}


