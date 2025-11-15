package com.HU1.HU1.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI ticketeraOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Ticketera API")
                        .description("Catálogo de Eventos y Venues (CRUD)")
                        .version("1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentación completa"));
    }
}