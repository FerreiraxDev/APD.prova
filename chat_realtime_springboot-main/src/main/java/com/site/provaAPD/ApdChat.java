package com.site.provaAPD;

//dependencias para configurar corretamente o Spring no webservice
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApdChat {

	public static void main(String[] args) {
		SpringApplication.run(ApdChat.class, args);//indica que esta é a classe principal para ser executada primeiro
	}

}
