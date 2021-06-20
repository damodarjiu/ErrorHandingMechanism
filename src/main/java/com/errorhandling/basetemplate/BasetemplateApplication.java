package com.errorhandling.basetemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication class for starting spring boot application.
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "RestApiErrorHandling", version = "2.0", description = "Rest Api "))
public class BasetemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasetemplateApplication.class, args);
    }

}
