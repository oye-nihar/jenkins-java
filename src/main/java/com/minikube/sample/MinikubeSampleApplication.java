package com.minikube.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MinikubeSampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(MinikubeSampleApplication.class, args);
    }
}


// package com.minikube.sample;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @EnableAutoConfiguration
// @RestController
// public class MinikubeSampleApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(MinikubeSampleApplication.class, args);
//     }

//     @GetMapping("/")
//     public String home() {
//         return "Hello from Dockerized Spring Boot App!";
//     }
// }



