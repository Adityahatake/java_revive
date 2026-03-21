import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

package com.spring.intro;


/**
 * Introduction to Spring Framework
 * Spring is a lightweight, open-source Java framework for building enterprise applications.
 * Key Features:
 * - Dependency Injection (DI)
 * - Aspect-Oriented Programming (AOP)
 * - MVC Pattern Support
 * - Transaction Management
 * - Security
 */

@SpringBootApplication
public class intro {

    public static void main(String[] args) {
        // SpringApplication.run() starts the Spring Boot application
        ApplicationContext context = SpringApplication.run(intro.class, args);
        System.out.println("Spring Application Started Successfully!");
    }
}

/**
 * REST Controller Example
 * Handles HTTP requests and returns responses
 */
@RestController
class WelcomeController {

    // GET endpoint
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Framework!";
    }

    @GetMapping("/about")
    public String about() {
        return "Spring is a framework for building Java applications with ease.";
    }
}

/**
 * Spring Basics:
 * 1. Dependency Injection - Spring manages object creation and dependencies
 * 2. Beans - Objects managed by Spring Container
 * 3. Annotations - @SpringBootApplication, @RestController, @Service, @Repository
 * 4. Application Properties - Manage configuration in application.properties
 * 5. Embedded Server - Tomcat runs by default on port 8080
 */