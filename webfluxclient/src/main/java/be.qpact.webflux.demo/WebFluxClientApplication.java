package be.qpact.webflux.demo;

import be.qpact.webflux.demo.model.Asset;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WebFluxClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxClientApplication.class, args);
    }

    @Bean
    WebClient  client(){
        return WebClient.create("http://localhost:8080");
    }

    @PostConstruct
    public void setUp(){
        client().get().uri("/assets")
                .accept(MediaType.TEXT_EVENT_STREAM)
                .exchange()
                .flatMapMany(cr -> cr.bodyToFlux(Asset.class))
                .map(a -> "Car:"+a.getMake()+" - "+a.getModel())
                .subscribe(System.out::println);
    }
}
