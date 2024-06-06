package kodlama.io.renAcar.config;


import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
  info = @Info(title = "Java Spring Boot API",
  description = "...",
  summary = "...",
  termsOfService =  "...",
  contact = @Contact(
    name="...",
    email = "...",
    url = "..."
  ),
  license = @License( name = "asd license" ),
  version = "API/v1"),
  servers = {
    @Server(description = "testEnv", url = "http://localhost:8080"),
    @Server(description = "prodEnv", url = "http://localhost:8081")
  },
  security = @SecurityRequirement(name = "security")
  )
  @SecurityScheme(
    in = SecuritySchemeIn.HEADER,
    name = "security", type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    description = "Basic Security",
    scheme = "bearer"
    
    )
@Configuration

public class SwaggerConfig {

  
}